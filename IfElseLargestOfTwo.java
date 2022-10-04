package abiya.com;
import java.util.Scanner;
public class IfElseLargestOfTwo {

	public static void main(String[] args) {
		int fnum,snum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		fnum=sc.nextInt();
		snum=sc.nextInt();
		if(fnum>snum) {
			System.out.println(fnum+"largest than "+snum);
		}
		else {
			System.out.println(snum+"largest than "+fnum);
		
		}

	}

}
