package com.fortuneteller.uiservice.controllers;

import com.fortuneteller.uiservice.services.fortunes.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;

@Controller
public class UIController {
    @Autowired
    FortuneService service;
    
	@GetMapping("/")
	String fortune(ModelMap model){
		model.put("fortunes", service.randomFortune());
		return "index";
	}    
}
