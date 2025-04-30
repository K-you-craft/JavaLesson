package com.example.app2;

public class Student {
	String name;
	int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public void introduce() {
		System.out.println(grade + "年生の" + name + "です、どうぞよろしくお願いします");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
