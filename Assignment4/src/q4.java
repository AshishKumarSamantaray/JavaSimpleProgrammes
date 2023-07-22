import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
	/*Write a program that finds greatest common divisor (GCD) 
	 * of two numbers using Euclid's
	algorithm, which is an iterative computation based on 
	the following observation: if y divides
	x, the GCD of x and y is y; otherwise, the GCD of x and y is 
	same as GCD of x % y and y.*/
	System.out.println("Enter the first number:-");
	Scanner sc = new Scanner (System.in);
	int x = sc.nextInt();
	System.out.println("Enter the second number:-");
	int y = sc.nextInt();
	while(x%y!=0)
	{int r = x%y;
	x=y;
	y=r;
	}
	System.out.println(x);
	}
	}

