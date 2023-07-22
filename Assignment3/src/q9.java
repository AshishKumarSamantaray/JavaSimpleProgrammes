import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		System.out.println("Enter the first number:");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the thirdnumber:");
		int c = sc.nextInt();
		int s= a +b+c;
		int max=Math.max(Math.max(a, b),Math.max (b,c));
		int min=Math.min(Math.min(a, b),Math.min (b,c));
		System.out.println("The largest number: "+max);
		System.out.println("The 2nd largest number: "+ (s -min-max));

	}

}
