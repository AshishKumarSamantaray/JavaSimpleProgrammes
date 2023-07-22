import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		System.out.println("Enter the first number:");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Enter the second number:");
		int b= sc.nextInt();
		System.out.println("Enter the third number:");
		int c= sc.nextInt();
		int s = a+b+c;
		int min = Math.min(Math.min(a, b), Math.min(b, c));
		int max = Math.max(Math.max(a, b), Math.max(b, c));
		int mid = s-max-min;
		if(a==max&&b==mid&&c==min)
		{System.out.println("The order is decreasing.");}
		else if(a==min&&b==mid&&c==max)
		{System.out.println("The order is increasing.");}
		else {System.out.println("The order is neither increasing nor decreasing.");}
	}

}
