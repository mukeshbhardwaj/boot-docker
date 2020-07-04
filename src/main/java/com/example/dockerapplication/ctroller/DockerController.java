package com.example.dockerapplication.ctroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@RequestMapping("/")
	public String greetings() {
		
		return "<h1> I am running on docker...  Awesome Aaaha :)</h1>";
	}
}
