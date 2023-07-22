import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		System.out.println("Enter the year:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if ((a%100!=0&&a%4==0)||a%400==0)
		{System.out.println("The year is a leap year.");}
		else {System.out.println("The year is not a leap year.");}

	}

}
