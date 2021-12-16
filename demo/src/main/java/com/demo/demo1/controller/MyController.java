package com.demo.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo1.entities.Courses;
import com.demo.demo1.services.CourseService;


@RestController
public class MyController<HttpStatus>
{


	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome to Courses applications";
	}
	
	// get the courses
	@GetMapping("/courses")
	public List<Courses>getCourses()
	{
		return this.courseService.getCourses();
	}
	
	//Single Course get
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	//Add Course
	@PostMapping("/courses")
	public Courses addCourses(@RequestBody Courses course)
	{
		return this.courseService.addCourses(course);
	}
	
	//Update Course using Put request
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses course)
	{
		return this.courseService.updateCourses(course);
	}
	
}