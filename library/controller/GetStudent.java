package com.jsp.library.controller;

import com.jsp.library.dto.Student;
import com.jsp.library.services.StudentService;

public class GetStudent {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = studentService.getStudentById(1);
		System.out.println("==============================");
		System.out.print(student.getId() + " " + "| ");
		System.out.print(student.getName() + " " + "| ");
		System.out.println(student.getMail() + " " + "| ");
		System.out.println("==============================");
	}
}

