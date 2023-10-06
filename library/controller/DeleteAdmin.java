package com.jsp.library.controller;

import com.jsp.library.services.AdminService;

public class DeleteAdmin {
	public static void main(String[] args) {
		
		AdminService adminService=new AdminService();
		
	 boolean	s= adminService.deleteAdmin(1);
	 System.out.println(s);
		
	}

}
