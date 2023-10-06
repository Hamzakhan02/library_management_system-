package com.jsp.library.controller;

import com.jsp.library.services.AdminService;

public class RejectAuthoritytoLibrarian {
	public static void main(String[] args) {
		
		AdminService adminService=new AdminService();
		
		
		adminService.rejectLibrarianById(1, 1);
		
		
		
		
	}

}
