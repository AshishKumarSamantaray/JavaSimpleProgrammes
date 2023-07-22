import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		/*Write a java program to print the 
		 * multiplication table of a number entered by the user.
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :-");
		int x =sc.nextInt();
		for (int i =1;i<=10;i++)
		{System.out.println(x+"X"+i+"="+(x*i));}
}}
