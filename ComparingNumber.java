package ifelseifladder;

import java.util.Scanner;

public class ComparingNumber {



		int num;
		void inputData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			num=sc.nextInt();
		}
		void checknum() {
			if(num==10) {
				System.out.println("The Number is 10" );
			}else if(num==20)  {
				System.out.println("The Number is 20");
				
			}else if(num==30) {
				System.out.println("The Number is 30");
			}else {
				System.out.println("The Number is 40");
			}
		}
		 public static void main(String[] args) {
			 ComparingNumber ob=new
			 ComparingNumber();
			 ob.inputData();
			 ob.checknum();
		 }

	}


