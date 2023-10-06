package com.jsp.library.controller;

import com.jsp.library.services.LibrarianService;

public class DeleteLibrarian {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService=new LibrarianService();
		
		librarianService.deleteLibrarian(2);		
		
	}
	
	 
	 
	 
	 

}
