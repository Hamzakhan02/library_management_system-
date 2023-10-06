package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.dto.Librarian;
import com.jsp.library.services.AdminService;
import com.jsp.library.services.LibrarianService;

public class SaveLibrarian {

	public static void main(String[] args) {

		LibrarianService librarianService = new LibrarianService();

		Librarian librarian = new Librarian();

		librarian.setName("xyzz");
		librarian.setCno(7554885956l);
		librarian.setStatus("authorise");

		librarianService.saveLibrarian(librarian);

//		AdminService adminService = new AdminService();
//
//		Admin admin = new Admin();
//		admin.setPassword("hamza");
//		admin.setUsername("hi");
//		adminService.saveAdmin(admin);

//		librarian.setAdmin(admin);
		
		Librarian librarian2= librarianService.saveLibrarian(librarian);
		
		System.out.println(librarian2.getId()+" saved");

	}

}
