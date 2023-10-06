package com.jsp.library.controller;


import com.jsp.library.services.StudentService;

public class DeleteStudent {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		if (studentService.deleteStudentById(7) != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
	}
}
