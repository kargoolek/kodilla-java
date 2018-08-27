package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchException;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    SearchFacade searchFacade;

    @Test
    public void testCompaniesNameSearching() {
        //Given
        List<Company> emptyListCompanies = new ArrayList<>();
        List<Company> twoElementsListCompanies = new ArrayList<>();
        List<Employee> emptyListEmployees = new ArrayList<>();
        List<Employee> twoElementsListEmployees = new ArrayList<>();
        Company c1 = new Company("Super Company1");
        Company c2 = new Company("Super Company2");
        Company c3 = new Company("Bad Company3");
        companyDao.save(c1);
        companyDao.save(c2);
        companyDao.save(c3);
        Employee e1 = new Employee("Name", "Kowalski");
        Employee e2 = new Employee("Name", "Nowak");
        Employee e3 = new Employee("Name", "Kuczyński");
        employeeDao.save(e1);
        employeeDao.save(e2);
        employeeDao.save(e3);

        //When
        try {
            emptyListCompanies = searchFacade.searchAllCompaniesContainingNameFragment(companyDao, "zzz");
        } catch (SearchException e) {
            //exception to handle
        }

        try {
            twoElementsListCompanies = searchFacade.searchAllCompaniesContainingNameFragment(companyDao, "super");
        } catch (SearchException e) {
            //exception to handle
        }

        try {
            emptyListEmployees = searchFacade.searchAllEmployeesContainingLastNameFragment(employeeDao, "zzz");
        } catch (SearchException e) {
            //exception to handle
        }

        try {
            twoElementsListEmployees = searchFacade.searchAllEmployeesContainingLastNameFragment(employeeDao, "ski");
        } catch (SearchException e) {
            //exception to handle
        }

        //Then
        Assert.assertTrue(emptyListCompanies.size() == 0);
        Assert.assertTrue(twoElementsListCompanies.size() == 2);
        Assert.assertTrue(emptyListEmployees.size() == 0);
        Assert.assertTrue(twoElementsListEmployees.size() == 2);

        //database cleanup
        employeeDao.delete(e1);
        employeeDao.delete(e2);
        employeeDao.delete(e3);
        companyDao.delete(c1);
        companyDao.delete(c2);
        companyDao.delete(c3);
    }

}
