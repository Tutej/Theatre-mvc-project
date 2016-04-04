package com.wn.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wn.cinema.domain.repository.ThetreRepository;

@Controller
public class TheatreController {

	@Autowired
	private ThetreRepository theatreRepository;
	
	
	@RequestMapping("/theatre")
	public String welcome(Model model) {
		model.addAttribute("theatre", theatreRepository.getAllAudithoriums());
		return "theatre";
	}
	
	@RequestMapping("/theatre")
	public String getAudithoriumById(@RequestParam("id") String id, Model model) {
		model.addAttribute("theatre", theatreRepository.getAllAudithoriums());
		return "theatre";
	}
	
}