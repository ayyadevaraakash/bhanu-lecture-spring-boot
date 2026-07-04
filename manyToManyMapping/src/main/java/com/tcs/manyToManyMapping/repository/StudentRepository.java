package com.tcs.manyToManyMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.manyToManyMapping.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
