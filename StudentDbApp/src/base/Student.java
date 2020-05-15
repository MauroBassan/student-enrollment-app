package base;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance = 0;
	// una variabile statica appartiene alla classe non all'istanza
	private static int courseCost= 600;
	private static int id= 1000;
	
	// constructor: prompt  stud to enter name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		this.firstName = sc.nextLine();
		
		System.out.println("Enter last name:");
		this.lastName = sc.nextLine();
		
		System.out.println("Grade:\n1. Freshmen \n2. Sophmore \n3. Junior \n4. Senior");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
		
	}
	
	// generare id
	private void setStudentID() {
		// grade level + static id
		id++;
		this.studentID = gradeYear+""+ id;		
	}
	
	// enroll in courses
	public void enroll() {
		do {
		System.out.println("Enter course to enroll (Q to quit):");
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		if (!course.equalsIgnoreCase("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + courseCost;
		}
		else { break;}
		} while (1 != 0);
		
	}
	
	//view balance
	public void viewBalance() {
		System.out.println("Your Balance is: €" + tuitionBalance);
	}
	// pay tuition
	public void payTuition() {
		System.out.println("Enter payment: ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Tnx 4 ur payment of: €" + payment);
		viewBalance();
	}
	
	// show status
	public String showInfo() {
		return "*** Your personal information *** \n" + "Name: " + firstName +" "+lastName + "\n"+
				"Grade: " + gradeYear + "\n" + 
				"Student ID: " + studentID + "\n"+
				"Courses Enrolled: " + courses + "\n" + 
				"Balance: €" + tuitionBalance;
	}
}
