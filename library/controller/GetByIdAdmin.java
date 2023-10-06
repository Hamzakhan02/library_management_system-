package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.services.AdminService;

public class GetByIdAdmin {
	public static void main(String[] args) {
		
		AdminService adminService=new AdminService();
//		Admin admin=new Admin();
		Admin admin= adminService.getById(1);
		
		 System.out.println(admin.getId());
		   System.out.println(admin.getUsername());
		   System.out.println(admin.getPassword());
		   
		  
		
				
		
		
	}

}
