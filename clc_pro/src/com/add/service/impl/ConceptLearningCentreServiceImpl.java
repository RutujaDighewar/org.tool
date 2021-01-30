package com.add.service.impl;

import java.util.Scanner;

import com.app.model.Batch;
import com.app.model.Course;
import com.app.model.Faculty;
import com.app.model.Student;
import com.app.service.ConceptLearningCentreService;

public class ConceptLearningCentreServiceImpl implements ConceptLearningCentreService {
	
	private Course course=null;
	private Batch batch=null;
	private Faculty faculty=null;
	private Student student=null;
	Scanner sc=new Scanner(System.in);

	@Override
	public void addCourse() {
		// TODO Auto-generated method stub
		System.out.println("Enter course name");
		course = new Course();
		course.setCname(sc.next());
		System.out.println("Enter course id");
		course.setId(sc.nextInt());

	}

	@Override
	public void addBatch() {
		// TODO Auto-generated method stub
		if(course!=null) {
			System.out.println("Enter Batch name");
			batch = new Batch();
			batch.setBname(sc.next());
			System.out.println("Enter batch id");
			batch.setId(sc.nextInt());
			
			batch.setCourse(course);
		}else {
			System.out.println("Course not found");
		}

	}

	@Override
	public void addFaculty() {
		// TODO Auto-generated method stub
		if(batch!=null) {
			System.out.println("Enter Faculty name");
			faculty = new Faculty();
			faculty.setFname(sc.next());
			System.out.println("Enter facutly id");
			faculty.setId(sc.nextInt());
			
			faculty.setBatch(batch);
		}else {
			System.out.println("Batch not found");
		}

	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		if(faculty!=null) {
			System.out.println("Enter Student name");
			student = new Student();
			student.setSname(sc.next());
			System.out.println("Enter student id");
			student.setId(sc.nextInt());
			
			student.setFaculty(faculty);
		}else {
			System.out.println("Faculty not found");
		}

	}

	@Override
	public void displayCourse() {
		// TODO Auto-generated method stub
		System.out.println("Course name    Course id");
  System.out.println(course.getCname()+"\t\t"+course.getId());
	}

	@Override
	public void displayBatch() {
		// TODO Auto-generated method stub
		if(course != null && batch != null) {
			System.out.println("Batch name    Batch id      Course name   Course id");
			System.out.println(batch.getBname()+"\t\t"+batch.getId()+"\t\t"+batch.getCourse().getCname()+"\t\t"+batch.getCourse().getId());
		}

	}

	@Override
	public void displayFaculty() {
		// TODO Auto-generated method stub
		if(batch!=null && faculty!=null) {
			System.out.println("Faculty name    Faculty id      Batch name   batch id");
			System.out.println(faculty.getFname()+"\t\t"+faculty.getId()+"\t\t"+faculty.getBatch().getBname()+"\t\t"+faculty.getBatch().getId());
		}

	}

	@Override
	public void displayStudent() {
		// TODO Auto-generated method stub
		if(faculty!=null && student!=null) {
			System.out.println("Stuent name    Student id      Faculty name   faculty id");
			System.out.println(student.getSname()+"\t\t"+student.getId()+"\t\t"+student.getFaculty().getFname()+"\t\t"+student.getFaculty().getId());
		}

	}

}
