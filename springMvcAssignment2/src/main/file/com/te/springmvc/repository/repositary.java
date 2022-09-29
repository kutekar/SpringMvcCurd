package com.te.springmvc.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.springframework.stereotype.Repository;

import com.te.springmvc.employee.employee;
@Repository
public class repositary {
	
	public void saveUser(employee emp) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(emp);
		transaction.begin();
		transaction.commit();
		
			
	}
	
	
	
	public void update(String name , String update) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
       	employee find = manager.find(employee.class, name);
       	transaction.begin();
       	manager.persist(find);
       	find.setDesignation(update);
       	transaction.commit();
		
	}
	public void delete(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
       	employee find = manager.find(employee.class, name);
       	transaction.begin();
       	manager.persist(find);
       	manager.remove(find);
       	transaction.commit();
	}
	public employee retrive(String name) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
	       	employee find = manager.find(employee.class, name);
		       return find;
			
	}
}
