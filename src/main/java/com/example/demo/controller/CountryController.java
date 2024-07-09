package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CountryService;

@RestController
public class CountryController {
	
	@GetMapping("/getMaseg")
	public String getMseg() {
		
		
		return "getApi.v1...!";
	}
	
	@Autowired
	CountryService ser;

	@GetMapping("/countries")
	public String allCities() {
		return ser.getCountries();
	}

	

}