package com.project.Project.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Project.entity.FavJobs;

public interface JobsRepo extends JpaRepository <FavJobs, Integer>{
	
	ArrayList<FavJobs> findByUserid(Integer userid);

	
	
}
