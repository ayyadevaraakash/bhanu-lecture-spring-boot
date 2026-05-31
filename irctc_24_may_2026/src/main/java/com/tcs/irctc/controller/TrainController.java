package com.tcs.irctc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.irctc.dto.TrainDetailsDto;
import com.tcs.irctc.repository.TrainRepository;

@RestController
public class TrainController {
	
	@Autowired
	public TrainRepository repo;
	
	@GetMapping("/fetchTrains")
	public List<TrainDetailsDto> getAllTrains() {
		List<TrainDetailsDto> ans = repo.findAll();
		return ans;
	}
	
}
