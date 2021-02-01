package com.abhirup.pradhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhirup.pradhan.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
