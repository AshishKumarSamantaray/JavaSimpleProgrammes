import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		/*Write a java program to enter two numbers through the keyboard. 
		 * Write a program to find the
		value of one number raised to the power of another. 
         (Do not use Java built-in method).*/
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number a:-");
		int a =sc.nextInt();
		System.out.println("Enter the second number b:-");
		int b = sc.nextInt();
		int c=(int) Math.pow(a, b);
		System.out.println("a raised to the power b is "+c);}}
