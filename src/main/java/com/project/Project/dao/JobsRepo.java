package com.project.Project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Project.entity.FavJobs;
import com.project.Project.entity.User;

public interface JobsRepo extends JpaRepository <FavJobs, Integer>{
	

	
	
}
