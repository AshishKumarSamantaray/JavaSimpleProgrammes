import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=1;
		while(b<=a)
		b*=3;
		System.out.println("The largest power of the number less than or equal to N is "+(b/3));
		
	}}
