package abiya.com;

import java.util.Scanner;
public class VowelsOrNot {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		ch=sc.next().charAt(0);
		 if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch+"is a vowel");
		 }
		 else {
			 System.out.println(ch+"is not an vowel" );
		 }

	}

}
