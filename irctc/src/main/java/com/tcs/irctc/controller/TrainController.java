package com.tcs.irctc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.irctc.dto.TrainNameDto;
import com.tcs.irctc.entity.TrainEntity;
import com.tcs.irctc.repository.TrainRepository;

@RestController
@RequestMapping("/api")
public class TrainController {
	
	@Autowired
	private TrainRepository repo;
	
	@PatchMapping("/train")
	public String updateCell(@RequestBody TrainNameDto outside) {
		Optional<TrainEntity> box = repo.findById(outside.getTrainNo());
		if (box.isEmpty()) {
			return "Please enter valid train number for update";
		}
		TrainEntity dbTrain = box.get();
		dbTrain.setTrainName(outside.getTrainName());
		repo.save(dbTrain);
		return "Data updated Successfully";
	}
	
	@PutMapping("/train")
	public String updateTrain(@RequestBody TrainEntity outside) {
		Optional<TrainEntity> box = repo.findById(outside.getTrainNo());
		if (box.isEmpty()) {
			return "Please enter valid train number for update";
		}
		TrainEntity dbTrain = box.get();
		dbTrain.setTrainName(outside.getTrainName());
		dbTrain.setSrc(outside.getSrc());
		dbTrain.setDest(outside.getDest());
		dbTrain.setTime(outside.getTime());
		repo.save(dbTrain);
		return "Train updated Successfully. Please use GET call to check";
	}

	@GetMapping("/train")
	public List<TrainEntity> getAllTrains() {
		List<TrainEntity> ans = repo.findAll();
		return ans;
	}
	
	@PostMapping("/train")
	public String addTrain(@RequestBody TrainEntity object) {
		repo.save(object);
		return "Data Added Successfully";
	}
	
	@DeleteMapping("/train/{trainNo}")
	public String deleteTrain(@PathVariable Integer trainNo) {
		repo.deleteById(trainNo);
		return "Data deleted successfully";
	}
}
