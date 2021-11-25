package com.example.trial_Work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TrialWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrialWorkApplication.class, args);
	}

//	@GetMapping
//	public String TrialWork(){
//		return "Trial";
//	}

}
