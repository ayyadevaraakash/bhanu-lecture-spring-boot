package com.tcs.oneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.oneToOneMapping.entity.Aadhaar;

@Repository
public interface AadhaarRepository extends JpaRepository<Aadhaar, Integer> {

}
