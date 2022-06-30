package com.example.EstockExchangeCogJava1187.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EstockExchangeCogJava1187.entity.Company;
import com.example.EstockExchangeCogJava1187.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
    
	public String addCompany(Company company)
	{  
		String result;
		Optional<Company> com=companyRepository.findById(company.getCompanyCode());
		if(com.isPresent())
		{
			result = "record is already present";
		}
		else
		{
			companyRepository.save(company);
			result = "Company added successfully";
		}
		return result;
	}
	
	
	
}
