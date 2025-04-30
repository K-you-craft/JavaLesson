package com.example.app;

import com.example.school.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("田中", 2);
		s1.introduce();
		
		com.example.app2.Student s2  = new com.example.app2.Student("佐藤", 3);
		s2.introduce();
	}

}
