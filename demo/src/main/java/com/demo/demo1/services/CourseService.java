package com.demo.demo1.services;

import java.util.List;

import com.demo.demo1.entities.Courses;

public interface CourseService 
{
	public List<Courses> getCourses();

	public Courses getCourse(Long courseId);

	public Courses addCourses(Courses course);
	public Courses updateCourses(Courses course);

	
}
 