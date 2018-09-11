package com.project.Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Project.entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
