import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		/*Write a java program to take an integer input from the user and 
		 * print the input by removing all zeros
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number:");
		int a = sc.nextInt();
		int sum = 0;
		double c = 0.1;
		while (a!=0)
		{int r = a%10;
		if(r!=0)
		{
		c=c*10;
		sum = (int) (sum +(r*c));
		a=a/10;
		}
		else
		a=a/10;
		}
		System.out.println("The desired number is "+sum);
	}

}
