import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		System.out.println("Enter the distance in km=");
		Scanner sc = new Scanner (System.in);
		double distance = sc.nextDouble();
		double metres = distance*1000;
		double feet = distance*3280.8399;
		double inch = distance*39370.0787;
		double centimetre = distance*100000;
		System.out.println(distance+" km is "+metres+" metres.");
		System.out.println(distance+" km is "+feet+" feet.");
		System.out.println(distance+" km is "+inch+" inches.");
		System.out.println(distance+" km is "+centimetre+" centimetres.");
		
	}

}
