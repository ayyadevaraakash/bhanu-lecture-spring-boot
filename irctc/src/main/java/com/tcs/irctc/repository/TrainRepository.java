package com.tcs.irctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.irctc.entity.TrainEntity;

public interface TrainRepository extends JpaRepository<TrainEntity, Integer> {

}
