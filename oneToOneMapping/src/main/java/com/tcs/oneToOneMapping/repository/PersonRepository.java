package com.tcs.oneToOneMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.oneToOneMapping.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
