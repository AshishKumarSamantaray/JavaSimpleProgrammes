import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int a = sc.nextInt();
		int sum = 0;
		for (int i =1;i<a;i++)
		{if(a%i==0)
		sum=sum+i;}
		if (a==sum)
		System.out.println("The give number "+a+" is a perfect number.");
		else
		System.out.println("The give number "+a+" is not a perfect number.");

	}}


