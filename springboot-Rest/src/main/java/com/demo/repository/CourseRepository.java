package com.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
