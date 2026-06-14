package com.tcs.manyToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.manyToOne.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
