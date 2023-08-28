package com.demo.service;

import java.util.List;

import com.demo.entity.Course;
import com.demo.repository.CourseRepository;

public class CourseServiceImpl implements CourseService {

	private CourseRepository courseRepo;
	
	
	
	@Override
	public String upsert(Course course) {
		courseRepo.save(course);   //upsert(insert/update based on pk)
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
