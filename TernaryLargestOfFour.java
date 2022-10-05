package abiya.com;
import java.util.Scanner;
public class TernaryLargestOfFour {

	public static void main(String[] args) {
		int fnum,snum,tnum,ftnum,largest;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four number");
		fnum=sc.nextInt();
		snum=sc.nextInt();
		tnum=sc.nextInt();
		ftnum=sc.nextInt();
		
		largest =( (fnum>snum && fnum>tnum && fnum>ftnum)?fnum:( snum>tnum && snum>ftnum)?snum:(tnum>ftnum)?tnum:ftnum);
	    System.out.println("The largest of"+fnum+","+snum+","+tnum+"and"+ftnum+"is"+largest);
		
		

	}

}
