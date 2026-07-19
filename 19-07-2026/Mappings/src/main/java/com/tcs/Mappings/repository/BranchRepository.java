package com.tcs.Mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.Mappings.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
