package com.project.Project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Project.entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {


	Quiz findByUserId(Integer id);

//	List<Quiz> findAllById(Integer user_id);
	
}
