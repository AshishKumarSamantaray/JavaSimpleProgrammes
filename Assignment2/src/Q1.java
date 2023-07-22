import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your temperature in farenheit scale:");
		
		
		double Farenheit = sc.nextDouble();
		
		double Celsius= (Farenheit-32)*(5.0/9);
		System.out.println(Farenheit+" degree farenheit is "+ Celsius + " degree celsius.");
		

	}

}
