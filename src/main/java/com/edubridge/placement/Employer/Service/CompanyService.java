package com.edubridge.placement.Employer.Service;

import java.util.List;

import com.edubridge.placement.Employer.Model.Company;

public interface CompanyService {
 List<Company> getAllCompanies();
 void saveCompany(Company company);
 
 
 Company getCompanyById(long id);
 void deleteCompanyById(long id);
 
	
	
	}
