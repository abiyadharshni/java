package abiya.com;
import java.util.Scanner;

public class UserInputData {

	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int i;
		float f;
		double d;
		byte b;
		short s;
		char ch;
		String fname;
		
		System.out.println("enter name:");
		fname=sc.next();
		System.out.println("enter integer value:");
		i=sc.nextInt();
		System.out.println("enter short int:");
		s=sc.nextShort();
		System.out.println("enter byte");
		b=sc.nextByte();
		System.out.println("enter float value");
        f=sc.nextFloat();
        System.out.println("enter double value");
        d=sc.nextDouble();
        System.out.println("enter char value");
        ch=sc.next().charAt(0);
        
        System.out.println("name:"+fname);
        System.out.println("integer value:"+i);
        System.out.println("short int:"+s);
        System.out.println("byte value:"+b);
        System.out.println("float value:"+f);
        System.out.println("double value:"+d);
        System.out.println("char:"+ch);
	}

}
