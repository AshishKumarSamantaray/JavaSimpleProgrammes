import java.util.Scanner;
public class q5 {
	
	public static double area(int n, double s) 
	{return (n*Math.pow(s, 2))/(4*Math.tan((Math.PI/n)));}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of sides:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the length of side:");
		double s=sc.nextDouble();
		System.out.println("The area of the polygon of side length "+s+ " and number of sides " + n + " is "+ area(n,s));

	}

}
