package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		//create operation
		student.setId(100);
		student.setName("New");
		service.addStudent(student);
		System.out.println("data is addedd successful");
		//retrive
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getId());
		System.out.println(" Name:"+student.getName()); 
		//update
		student = service.findStudentById(100);
		student.setName("Technology");
		service.updateStudent(student);
		System.out.println("update is successful");
		
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getId());
		System.out.println(" Name:"+student.getName());
		
		
		//delete
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("deletion is successful"); 


	}

}
