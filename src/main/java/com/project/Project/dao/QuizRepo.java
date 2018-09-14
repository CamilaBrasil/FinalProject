package com.project.Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Project.entity.Skills;

public interface QuizRepo extends JpaRepository<Skills, Integer> {


	Skills findByUserId(Integer id);
	
}
