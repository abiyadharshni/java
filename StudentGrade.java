package ifelseifladder;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		int marks;
		System.out.println("ENTER THE MARKS=");
		Scanner scan = new Scanner(System.in);
		marks=scan.nextInt();
		if(marks>=90&&marks<=100) {
			System.out.println(" GRADE A");
		}
		else if(marks>=70&&marks<=89) {
			System.out.println(" GRADE B");
	}
		else if(marks>=50&&marks<=69) {
			System.out.println(" GRADE C");
	}
		else if(marks>=30&&marks<=49) {
			System.out.println(" GRADE D");
	}
		else if(marks>=0&&marks<=29) {
			System.out.println("FAIL");
	}
		else  {
			System.out.println(" INVALID MARKS");
	}

	}

}
