package com.subtitles.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class show {
	
	String cosik = "nima";
	

	
	@RequestMapping("/show/{cos}")
	public String addCos(@PathVariable("cos") String ccos, Model model){
		
		this.cosik = ccos;
		model.addAttribute("wordShow", cosik);
		return "show";
	}

}
