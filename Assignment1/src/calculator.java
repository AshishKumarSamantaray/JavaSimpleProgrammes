import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(">>>>>>>>>>>>>>>>>>Hello User<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Enter the first number:-");
		int a = sc.nextInt();
		System.out.println("Enter the second number:-");
		int b = sc.nextInt();
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a/b;
		int g = a%b;
		System.out.println("The summation of your numbers is " + c);
		System.out.println("The difference of your numbers is " + d);
		System.out.println("The product of your numbers is " + e);
		System.out.println("The quotient after division of your numbers is " + f);
		System.out.println("The remainder after division of your numbers is " + g);
		
		
		
			
	}

}
