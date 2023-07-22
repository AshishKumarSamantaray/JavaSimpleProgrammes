import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		System.out.println("Enter the basic salary=");
		Scanner sc = new Scanner (System.in);
		int bs = sc.nextInt();
		double da = bs*0.4;
		double hra = bs*0.6;
		double total = bs + da+hra;
		System.out.println("DA is "+da);
		System.out.println("HRA is "+hra);
		System.out.println("Gross Salary is "+total);
		
		
		
		
		
		
		
		
		
		
		
		//Enter basic salary: 15600
		//DA is 6240.0
		//HRA is 3120.0
		//Gross salary is 24960
		//Enter the basic salary of an employee of an organization through the keyboard. His dearness
		//allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
		//salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross
		//salary.

	}

}
