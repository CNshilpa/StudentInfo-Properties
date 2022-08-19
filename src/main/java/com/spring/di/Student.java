package com.spring.di;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student name is : " + name);
		System.out.println("Student interested course : " + interestedCourse);
		System.out.println("Student hobby : " + hobby);
	}
}
