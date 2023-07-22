import java.util.Scanner;
public class q1 {

public static int additionSimple(int x, int y){return x+y;}
public static int subtractionSimple(int x, int y){return x-y;}
public static int multiplicationSimple(int x, int y){return x*y;}
public static double divisionSimple(int x, int y){return x/y;}
public static int remainderSimple(int n, int m) {return n%m;}
public static double squareRootSimple(int n){return Math.sqrt(n);}

public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the two number:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Enter the operator:");
	char c= sc.next().charAt(0);
	switch(c) 
	{case '+': 
	System.out.println("The addition of numbers is :"+additionSimple(a,b));
	break;
				
	case '*': 
	System.out.println("The multiplication of numbers is :"+multiplicationSimple(a,b));
	break;
	
	case '/': 
	System.out.println("The division of numbers is :"+divisionSimple(a,b));
	break;
	
	case '%': 
	System.out.println("The remainder of numbers is :"+remainderSimple(a,b));
	break;
	
	case '>': 
	System.out.println("The square roots of numbers is :"+squareRootSimple(a)+" and "+squareRootSimple(b));
	break;

	
}
}}