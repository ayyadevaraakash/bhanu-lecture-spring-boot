package com.tcs.manyToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.manyToOne.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, String> {

}
