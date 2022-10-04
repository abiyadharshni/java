package ifelseifladder;

import java.util.Scanner;

public class IfElseIfLadderLargest {


		public static void main(String[] args) {
			int fnum,snum,tnum;
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER=");
			fnum=sc.nextInt();
			snum=sc.nextInt();
			tnum=sc.nextInt();
			if(fnum>snum&&fnum>tnum) {
				System.out.println("largest of"+fnum+","+snum+"and"+tnum+"is"+fnum);
					
			}
			else if(snum>fnum&&snum>tnum) {
				System.out.println("largest of"+fnum+","+snum+"and"+tnum+"is"+snum);
					
			}
			else {
				System.out.println("largest of"+fnum+","+snum+"and"+tnum+"is"+tnum);
					
			}
			

			}

		}

	
