package com.edubridge.placement.Employer.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.placement.Employer.Model.Company;
import com.edubridge.placement.Employer.Repository.CompanyRepository;


@Service

public class CompanyServiceImpl  implements CompanyService{

	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();	
	}

	@Override
	public void saveCompany(Company company) {
		this.companyRepository.save(company);
		
	}

	
	

	@Override
	public Company getCompanyById(long id) {
		Optional<Company> optional = companyRepository.findById(id);
		Company company = null;
		if(optional.isPresent()) {
			company = optional.get();
			
		}else {
			throw new RuntimeException("Company not found for i :: " + id);
			
		}
	
	return company;
	}

	@Override
	public void deleteCompanyById(long id) {
		this.companyRepository.deleteById(id);
		
	}
	

	
}


