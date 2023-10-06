package com.jsp.library.controller;

import com.jsp.library.services.AdminService;

public class GetAllUnaothoriseLib {
	public static void main(String[] args) {
		
		AdminService adminService=new AdminService();
		adminService.getAllUnauthoriseLibByid();
		
	}

}
