package com.tcs.IrctcProject.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.IrctcProject.dto.SourceAndDestinationDto;
import com.tcs.IrctcProject.entity.TrainMaster;
import com.tcs.IrctcProject.repository.TrainRepository;
import com.tcs.IrctcProject.response.TrainResponse;

@Service
public class TrainService {

	@Autowired
	private TrainRepository trainRepository;

	public TrainResponse fetchTrains() {
		List<TrainMaster> res = trainRepository.findAll();
		return new TrainResponse(LocalDateTime.now(), "DATA FOUND", res);
	}

	public TrainResponse insertTrain(TrainMaster outside) {
		trainRepository.save(outside);
		return new TrainResponse(LocalDateTime.now(), "DATA INSERTED", "Data has been added successful");
	}

	public TrainResponse editTrain(Integer id, SourceAndDestinationDto outside) {
		Optional<TrainMaster> box = trainRepository.findById(id);
		if (box.isEmpty()) {
			return new TrainResponse(LocalDateTime.now(), "FAILED", "Please enter correct train number");
		} else {
			TrainMaster trainMaster = box.get();
			trainMaster.setSource(outside.getSource());
			trainMaster.setDestination(outside.getDestination());
			trainRepository.save(trainMaster);
			return new TrainResponse(LocalDateTime.now(), "DATA EDITED", "Data updated Successfully");
		}
	}

	public TrainResponse removeTrain(Integer id) {
		trainRepository.deleteById(id);
		return new TrainResponse(LocalDateTime.now(), "DATA DELETED", "Train Deleted Successfully");
	}

}