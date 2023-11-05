package com.spring.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitJenkinsController {
	
	@GetMapping("/gitJenkinDocker/{person}")
	@ResponseBody
	public String greeting(@PathVariable("person") String greeting) {
		return "Welcome"+greeting +" to Git-Jenkins-Docker Integration Tutorial";
	}

}
