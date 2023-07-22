import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		//Write a java program that reads the radius of a hemisphere and computes the surface area
		//and volume using the following formulas:
		//Surface Area of Hemisphere = 3 π r 2 . Volume of a hemisphere = (2/3)πr 3
		//Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the
		//hemisphere. Hint: Use Math.PI.
		System.out.println("Enter the radius of the hemisphere=");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double area = 3*Math.PI*Math.pow(radius, 2.0);
		double volume = (2.0/3)*Math.PI*Math.pow(radius, 3.0);
		System.out.println("The surface area of the hemisphere is "+area);
		System.out.println("The volume of the hemisphere is "+volume);
	}

}
