package com.example.EstockExchangeCogJava1187.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.EstockExchangeCogJava1187.service.CompanyService;
import com.example.EstockExchangeCogJava1187.entity.Company;;

@RestController
@RequestMapping("/estock-ms1")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/addCompany")
	public String addCompany(@RequestBody Company company)
	{
		if(company.getTurnover() > 100000000)
		{
			return companyService.addCompany(company);
		}
		else
		{
			return "Turnover should be greater than 10Cr";
		}
		
	}

}
