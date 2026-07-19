package com.tcs.Mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.Mappings.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
