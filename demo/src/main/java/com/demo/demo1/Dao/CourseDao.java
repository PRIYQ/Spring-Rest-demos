package com.demo.demo1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo1.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long>
{
	

}
