package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveByFirstLetters(@Param("LETTERS") String letters);

    @Query(nativeQuery = true)
    List<Company> retrieveByFirstLetters2(@Param("NO_LETTERS") int noLetters, @Param("LETTERS") String letters);

    @Query
    List<Company> retrieveContainingLetters(@Param("LETTERS") String letters);
}