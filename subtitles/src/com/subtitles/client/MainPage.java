package com.subtitles.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPage {
	
	@RequestMapping("/welcome")
	public String index(Model model){
		
		model.addAttribute("message", "Wiadomosc z mainpage add atribute");
		
		model.addAttribute("message2", "A tru druga message");
	
		return "welcome";
	}

}
