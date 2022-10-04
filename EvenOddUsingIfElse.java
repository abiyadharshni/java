package abiya.com;
 
import java.util.Scanner;

public class EvenOddUsingIfElse {
	int num;
	void inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		}
    void checkEvenOdd() {
    	if(num%2==0) {
    		System.out.println(num+"even number");
    		}
    	else {
    		System.out.println(num+"odd number");
		
    	}
    }
	public static void main(String[] args) {
		EvenOddUsingIfElse ob=new EvenOddUsingIfElse();
		ob.inputNum();
		ob.checkEvenOdd();

	}

}
