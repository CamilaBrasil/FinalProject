package com.project.Project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Project.entity.FavJobs;

public interface JobsRepo extends JpaRepository <FavJobs, Integer>{
	

	
	
}
