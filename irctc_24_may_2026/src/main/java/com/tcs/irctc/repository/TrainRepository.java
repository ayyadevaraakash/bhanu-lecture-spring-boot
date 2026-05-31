package com.tcs.irctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.irctc.dto.TrainDetailsDto;

@Repository
public interface TrainRepository extends JpaRepository<TrainDetailsDto, Integer> {
}