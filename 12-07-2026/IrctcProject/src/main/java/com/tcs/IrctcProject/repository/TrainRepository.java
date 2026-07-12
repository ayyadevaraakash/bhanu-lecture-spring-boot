package com.tcs.IrctcProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.IrctcProject.entity.TrainMaster;

@Repository
public interface TrainRepository extends JpaRepository<TrainMaster, Integer> {

}
