package abiya.com;
import java.util.Scanner;

public class TernaryLargetOfTwo {

	public static void main(String[] args) {
		int fnum,snum,lar;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter two number");
		fnum=sc.nextInt();
		snum=sc.nextInt();
		
		lar=(fnum>snum)?fnum:snum;
		System.out.println("The Largest of"+fnum+"and"+snum+"is"+lar);
		

	}

}
