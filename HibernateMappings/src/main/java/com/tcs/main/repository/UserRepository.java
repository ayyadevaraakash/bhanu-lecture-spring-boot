package com.tcs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.main.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
