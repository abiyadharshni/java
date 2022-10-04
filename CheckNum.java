package abiya.com;
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		if(num>0) {
			System.out.println("THE NUMBER IS POSITIVE");
			}
		if(num<0) {
			System.out.println("THE NUMBER IS NEGATIVE");
			}
		if(num==0) {
			System.out.println("THE NUMBER IS ZERO");
			}
         
	
}

}
