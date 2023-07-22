import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Enter the third number: ");
		int c = sc.nextInt();
		for (;a<=b;a=a+c)
		{System.out.println(a);}
}
}
