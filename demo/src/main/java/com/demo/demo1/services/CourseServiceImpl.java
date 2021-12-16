package com.demo.demo1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo1.Dao.CourseDao;
import com.demo.demo1.entities.Courses;
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
		//List<Courses>list;
		
		public CourseServiceImpl()
		{
	//	list= new ArrayList<>();
     // list.add(new Courses(145, "Core Java Course","This course contains basics of Java"));
	//	list.add(new Courses(432,"Spring Boot Course","Creating RestAPI using Spring Boot"));
		}
	@Override
	public List<Courses> getCourses() {
		return courseDao.findAll();
		
	}
	@Override
	public Courses getCourse(Long courseId) {
		//Courses c=null;
	//	for(Courses course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
				
//			}
	//	}
				return courseDao.getOne(courseId);
		
	}
	@Override
	public Courses addCourses(Courses course) {
	//	list.add(course);
	    courseDao.save(course);
	    
	    return course;
	   
		
	}
	@Override
	public Courses updateCourses(Courses course)
	{
		//list.forEach(e->{
			//if(e.getId()==course.getId())
			//{
				//e.setTitle(course.getTitle());
				//e.setDescription(course.getDescription());
		//	}
		//});
		return courseDao.save(course);
		
	}
	//@Override
//	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		
	}
	
	

