package com.edubridge.placement.Employer.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.edubridge.placement.Employer.Model.Company;
import com.edubridge.placement.Employer.Repository.UserRepository;
import com.edubridge.placement.Employer.Service.CompanyService;


@Controller
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@Autowired
	@SuppressWarnings("unused")
	private UserRepository repo;
	
	
	@GetMapping("")
	 public String viewHomePage() {
	 return "Home";
}
	

	
	@GetMapping("/index")
	public String viewIndexPage(Model model) {
        model.addAttribute("listCompanies", companyService.getAllCompanies());
		return "index";
		
	}
	
   @GetMapping("/showNewCompanyForm")
	public String showNewCompanyForm(Model model) {
	   
	   Company company = new Company();
	   model.addAttribute("company", company);
	   return"/new_company";
	   
   }

   @PostMapping("/saveCompany")
public String saveCompany(@ModelAttribute("company") Company company) {
	companyService.saveCompany(company);
	return "redirect:/index";
	   
	   
}

   @GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		Company company = companyService.getCompanyById(id);
		model.addAttribute("company", company);
		return "update_company";
	}
   @GetMapping("/deleteCompany/{id}")
   public String deleteCompany(@PathVariable (value = "id") long id) {
      
	  this.companyService.deleteCompanyById(id);
	  return "redirect:/index";
   
}
   
  
}
