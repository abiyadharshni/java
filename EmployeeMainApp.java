/* 
 ENCAPSULATION:wrapping of member data(variable) and member function inside the class is called Encapsulation
 */



package abiya.com;
import java.util.Scanner;
class Employee{
	//instance variable : the variable declared in the class
	private int age; 
	private String name;
	private float salary;
	
	
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		name=sc.nextLine();
		System.out.println("enter agae:");
		age=sc.nextInt();
		System.out.println("enter the salary:");
		salary=sc.nextFloat();
		
	}
	public void employeeDiplay() { //member functions
		//int totalsalary;local variable: the variable declared inside the method
		               //local variable does not have default values
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
		//System.out.println("totalsalary:"+totalsalary);
		
		}

}
public class EmployeeMainApp {

	public static void main(String[] args) {
		System.out.println("main method");
		Employee employeeobject1=new Employee();
		employeeobject1.inputData();
	    employeeobject1.employeeDiplay();
		Employee employeeobject2=new Employee();
		employeeobject2.inputData();
		employeeobject2.employeeDiplay();
		

	}

}
