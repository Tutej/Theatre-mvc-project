package com.wn.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wn.cinema.domain.repository.AudithoryRepository;

@Controller
public class AudithoryController {

	@Autowired
	private AudithoryRepository audithoryRepository;
	
	
	@RequestMapping("/audithory")
	public String welcome(Model model) {
		model.addAttribute("audithory", audithoryRepository.getAllSeats());
		model.addAttribute("audithory", audithoryRepository.getMovie());
		return "audithory";
	}
}