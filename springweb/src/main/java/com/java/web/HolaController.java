package com.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaController {
	
	@RequestMapping("/hola")
	public String hola() {
		return "mensaje";
	}
}
