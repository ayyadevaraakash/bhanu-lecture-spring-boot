package com.tcs.irctc.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("dev")
public class PassengerController {
	
	@GetMapping("/passenger")
	public int get() {
		return 5;
	}
}
