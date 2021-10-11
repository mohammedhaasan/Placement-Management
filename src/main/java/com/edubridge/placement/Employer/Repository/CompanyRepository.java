package com.edubridge.placement.Employer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.placement.Employer.Model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
