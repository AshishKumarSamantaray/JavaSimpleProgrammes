import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		/*WAP to calculate and display the factorial of all numbers
		 *  between m and n (where m < n, m> 0, n > 0
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int j = a;j<=b;j++)
			{int fact=1;
			for (int k = 2;k<=j;k++)
			fact=fact*k;
			System.out.println("Factorial of "+j+" is "+fact);}
		}}
