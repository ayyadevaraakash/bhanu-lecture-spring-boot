package com.tcs.irctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.irctc.entity.TrainEntity;

@Repository
public interface TrainRepository extends JpaRepository<TrainEntity, Integer> {

}
