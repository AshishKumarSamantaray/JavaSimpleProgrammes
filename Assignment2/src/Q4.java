import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		System.out.println("Enter the integer between 0 and 1000=");
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		int ones= num%10;
		num=num/10;
		int tens = num%10;
		num=num/10;
		int hundreds=num%10;
		num=num/10;
		int thousands = num%10;
		int total = ones+tens+hundreds+thousands;
		System.out.println("The sum of the digits of the number is "+total);
	

	}

}
