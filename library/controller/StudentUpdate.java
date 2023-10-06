package com.jsp.library.controller;


import com.jsp.library.services.StudentService;

public class StudentUpdate {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		if (studentService.updateStudentNameById(1, "Hamza") != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}
	}
}

