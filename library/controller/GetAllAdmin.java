package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Admin;
import com.jsp.library.services.AdminService;

public class GetAllAdmin {
	
	public static void main(String[] args) {
		
		AdminService adminService=new AdminService();
		
		List<Admin> admin= adminService.getAll();
        
        for(Admin f: admin) {
 			System.out.println("======================");
 			System.out.println(f.getId());
 			System.out.println(f.getPassword());
 			System.out.println(f.getUsername());
 			
 			System.out.println("=======================");
        }
    
		
		
		
		
		
	}

}
