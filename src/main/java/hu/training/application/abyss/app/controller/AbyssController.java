package hu.training.application.abyss.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AbyssController {
	
	@RequestMapping("/index")
	public String mainPage() {
		return "index";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/nem")
	public String nem() {
		return "nemhiszemelgeci";
	}
}