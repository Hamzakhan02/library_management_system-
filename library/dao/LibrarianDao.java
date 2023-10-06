package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Admin;
import com.jsp.library.dto.Librarian;

public class LibrarianDao {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hamza");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Librarian librarian=new Librarian();
	Admin admin=new Admin();
	
	public Librarian saveLibrarian(Librarian librarian) {
		
			entityTransaction.begin(); 
		   entityManager.persist(librarian);
//		   entityManager.persist(admin);
		   entityTransaction.commit();
		   
		   return  librarian;
			
	}
	
	public boolean deleteLibrarian(int id) {
		Librarian librarian = entityManager.find(Librarian.class, id);

		if (librarian != null) {
			entityTransaction.begin();
			entityManager.remove(librarian);
			entityTransaction.commit();
			System.out.println("Deleted ");
			return true;
		} else {
			System.out.println(" Not Deleted ");
			return false;
		}
	}
	
	public Librarian updateLibararian(Librarian libraraian) {
		
		
		if (libraraian != null) {
			entityTransaction.begin();
			entityManager.persist(libraraian);
			entityTransaction.commit();
		}
		return libraraian;
	}
	
	public Librarian getLibrarianById(int id) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		if (id > 0) {
			System.out.println(librarian.getId());
			System.out.println(librarian.getName());
			System.out.println(librarian.getStatus());
		}
		return librarian;
	}
	
	public List<Librarian> getAllLibrarian() {
		String sql = "SELECT l FROM Librarian l";
		Query query = entityManager.createQuery(sql);
		List<Librarian> librarian = query.getResultList();

		return librarian;
	}
	
	public boolean approve(Librarian librarian) {
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return true;
	}
	

	
	
	
	
	
	

}
