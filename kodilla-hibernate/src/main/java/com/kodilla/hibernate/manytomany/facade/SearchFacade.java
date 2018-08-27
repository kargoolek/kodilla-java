package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> searchAllCompaniesContainingNameFragment(CompanyDao companyDao, String nameFragment) throws SearchException {
        List<Company> lstCompanies = new ArrayList<>();
        LOGGER.info("Searching for name of companies containing phrase: " + nameFragment);
        lstCompanies = companyDao.retrieveContainingLetters(nameFragment);
        if (lstCompanies.size() == 0) throw new SearchException(SearchException.ERR_NOTHING_FOUND);
        else LOGGER.info("Query finished. Result count: "+lstCompanies.size());
        return lstCompanies;
    }

    public List<Employee> searchAllEmployeesContainingLastNameFragment(EmployeeDao employeeDao, String nameFragment) throws SearchException {
        List<Employee> lstEmployees = new ArrayList<>();
        LOGGER.info("Searching for last name of employees containing phrase: " + nameFragment);
        lstEmployees = employeeDao.retrieveByLastNameFragment(nameFragment);
        if (lstEmployees.size() == 0) throw new SearchException(SearchException.ERR_NOTHING_FOUND);
        else LOGGER.info("Query finished. Result count: "+lstEmployees.size());
        return lstEmployees;
    }
}