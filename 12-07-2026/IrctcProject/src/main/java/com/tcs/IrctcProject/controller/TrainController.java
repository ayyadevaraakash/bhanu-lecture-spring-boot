package com.tcs.IrctcProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.IrctcProject.dto.SourceAndDestinationDto;
import com.tcs.IrctcProject.entity.TrainMaster;
import com.tcs.IrctcProject.response.TrainResponse;
import com.tcs.IrctcProject.service.TrainService;


@RestController
public class TrainController {
	
	@Autowired
	private TrainService trainService;
	
	@GetMapping("/api/train")
	public ResponseEntity<TrainResponse> getTrains() {
		return ResponseEntity.ok().body(trainService.fetchTrains());
	}
	
	@PostMapping("/api/train")
	public ResponseEntity<TrainResponse> addTrain(@RequestBody TrainMaster outside) {
		return ResponseEntity.ok().body(trainService.insertTrain(outside));
	}
	
	@PatchMapping("/api/train/{id}")
	public ResponseEntity<TrainResponse> modifyTrain(@PathVariable Integer id, @RequestBody SourceAndDestinationDto outside) {
		return ResponseEntity.ok().body(trainService.editTrain(id, outside));
	}
	
	@DeleteMapping("/api/train")
	public ResponseEntity<TrainResponse> deleteTrain(@RequestParam Integer id) {
		return ResponseEntity.ok().body(trainService.removeTrain(id));
	}
}