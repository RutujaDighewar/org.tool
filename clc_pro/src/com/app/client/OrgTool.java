package com.app.client;

import java.util.Scanner;

import com.add.service.impl.ConceptLearningCentreServiceImpl;

public class OrgTool {

	public static void main(String[] args) {

		ConceptLearningCentreServiceImpl c=new ConceptLearningCentreServiceImpl();
		Scanner sc=new Scanner(System.in);
		String s=" ";
		
	do {
		System.out.println("1] add course");
		System.out.println("2] add batch");
		System.out.println("3] add faculty");
		System.out.println("4] add student");
		System.out.println("5] view course");
		System.out.println("6] view batch");
		System.out.println("7] view faculty");
		System.out.println("8] view student");
		System.out.println();
		
		
		System.out.println("Enter your choice");
		int i=sc.nextInt();
		
	
		switch(i) {
		case 1 :
			   c.addCourse();
			   break;
		case 2 :
			   c.addBatch();
			  break;
		case 3 :
			   c.addFaculty();
			   break;
		case 4 :
			   c.addStudent();
			   break;
		case 5 :
			   c.displayCourse();
			   break;
		case 6 :
			   c.displayBatch();
			   break;
		case 7 : 
	           c.displayFaculty();
	           break;
		case 8 :
			   c.displayStudent();
			   break;
			  default:
				  System.out.println("Invalid selection");
		}
		System.out.println("Do you want to continue : y/n");
		s=sc.next();
	}
	while(s.equals("y"));

}
}