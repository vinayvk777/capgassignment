package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class Controller {
     @RequestMapping("/home")
	public String show() {
    
		return "home";
	}
}
