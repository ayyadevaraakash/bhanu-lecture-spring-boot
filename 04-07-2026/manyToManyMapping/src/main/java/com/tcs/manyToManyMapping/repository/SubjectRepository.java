package com.tcs.manyToManyMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.manyToManyMapping.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
