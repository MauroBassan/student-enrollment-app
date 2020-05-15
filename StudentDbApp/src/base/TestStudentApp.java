package base;

import java.util.Scanner;

public class TestStudentApp {

	public static void main(String[] args) {
		
		// ask how many users we want to add
		System.out.println("Enter number of new students to enroll:");
		Scanner sc = new Scanner(System.in);
		int numOfStuds = sc.nextInt();
		Student [] students = new Student[numOfStuds];
		
		
		// create n number of studs
		for (int i = 0; i < numOfStuds; i++) {
			
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
			// il metodo showInfo è come il toString che appartiene a object
			for ( int n = 0; n < students.length; n++) {
			System.out.println(students[n].showInfo());
			}
		}
	}
