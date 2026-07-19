package com.tcs.Mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.Mappings.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
