package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@NamedQueries({
        @NamedQuery(
                name = "Company.retrieveByFirstLetters",
                query = "FROM Company WHERE name LIKE CONCAT(:LETTERS,'%')"
        ),
        @NamedQuery(
                name = "Company.retrieveContainingLetters",
                query = "FROM Company WHERE name LIKE CONCAT('%', :LETTERS,'%')"
        )
})
@NamedNativeQuery(
        name = "Company.retrieveByFirstLetters2",
        query = "SELECT * FROM Companies WHERE LEFT (company_name, :NO_LETTERS) = :LETTERS",
        resultClass = Company.class
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(final List<Employee> employees) {
        this.employees = employees;
    }
}