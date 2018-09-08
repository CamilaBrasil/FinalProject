package com.project.Project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Project.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	User findByEmail(String keyword);
}
