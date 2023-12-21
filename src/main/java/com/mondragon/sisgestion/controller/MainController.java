package com.mondragon.sisgestion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/infra")
	public String getInfracciones(Model model) {
		return "principal";
	}
}
