package com.prodep.bringboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prodep.bringboard.model.Course;

@RestController
public class CourseController {

	@RequestMapping(value = "/getAllCourses", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Course> getCourses() {
		
		List<Course> listOfCourses = new ArrayList<>();
		Course c1 = new Course();
		c1.setId(3);
		c1.setCourseName("Java");
		listOfCourses.add(c1);
		return listOfCourses;
	}
}
