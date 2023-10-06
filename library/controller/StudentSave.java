package com.jsp.library.controller;



import com.jsp.library.dto.Student;
import com.jsp.library.services.StudentService;

public class StudentSave {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = new Student();

		student.setName("abc");
		student.setMail("abc@mail.com");

		studentService.saveStudent(student);
	}
}

