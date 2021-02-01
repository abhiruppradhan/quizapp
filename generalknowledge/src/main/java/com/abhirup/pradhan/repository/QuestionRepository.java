package com.abhirup.pradhan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhirup.pradhan.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
