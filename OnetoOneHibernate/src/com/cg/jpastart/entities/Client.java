 package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
	
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setName("Kusuma");
		
		Address homeAddress = new Address();
		homeAddress.setStreet("Huttha colony");
		homeAddress.setCity("Bhadravathi");
		homeAddress.setState("Karnataka");
		homeAddress.setZipcode("577 301");
		
		
		//inject address to student table
		student.setAddress(homeAddress);
		
		//persist
		em.persist(student);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
