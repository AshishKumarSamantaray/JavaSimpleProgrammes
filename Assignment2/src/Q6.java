import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		//When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The
		//distance it travels is given by d = (1/2) gt 2
		//Here d is in feet, t is the time in seconds, and g is 32.174.
		//Write a program that asks the user for the number of seconds and then prints out the distance
		//travelled.
		System.out.println("Enter the time in seconds=");
		Scanner sc = new Scanner (System.in);
		double t = sc.nextDouble();
		double g = 32.174;
		double d = (1.0/2)*g*Math.pow(t, 2.0);
		System.out.println("Distance travelled : "+ d+" feet");
	}

}
