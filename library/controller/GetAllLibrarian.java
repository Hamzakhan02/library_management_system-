package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Admin;
import com.jsp.library.dto.Librarian;
import com.jsp.library.services.LibrarianService;

public class GetAllLibrarian {

	public static void main(String[] args) {

		LibrarianService librarianService = new LibrarianService();
		librarianService.getAllLibrarian();

		List<Librarian> librarians = librarianService.getAllLibrarian();

		for (Librarian a : librarians) {
			System.out.println("======================");
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getStatus());
			System.out.println(a.getCno());

			System.out.println("=======================");
		}

	}

}
