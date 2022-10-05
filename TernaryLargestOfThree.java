package abiya.com;
import java.util.Scanner;

public class TernaryLargestOfThree {

	public static void main(String[] args) {
		int fnum,snum,tnum,largest;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three number=");
		fnum=sc.nextInt();
		snum=sc.nextInt();
		tnum=sc.nextInt();
		
		largest =(fnum>snum&&fnum>tnum)?fnum:(snum>fnum&&snum>tnum)?snum:tnum;
       System.out.println("The largest "+fnum+","+snum+"and"+tnum+"is"+largest);
	}

}
