import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		/*Write a java program that takes an integer N from user, uses
Math. Random () to print N random integer numbers between 1 to N, and then prints their
average value. Use do while loop.*/
	System.out.println("Enter the number :-");
	Scanner sc = new Scanner (System.in);
	int N=sc.nextInt();
	int sum = 0;
	int i = 1;
	do {int r = (int)(Math.random()*N)+1;
	sum = sum+r;
	i++;}
	while(i<=N);
	int average = sum/N;
	System.out.println("The average value of n random integers from 1 to N is "+average);
	}}
