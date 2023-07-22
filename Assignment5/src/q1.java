import java.util.Scanner;
public class q1 {
	static int div(int a)
	{	int sum=0;
		for(int i=1;i<=a/2;i++)
		{if (a%i==0)
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two numbers:");
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(div(b)==c&&div(c)==b)
		System.out.println("The numbers "+b+" and "+c+" are amicable numbers.");
		else
		System.out.println("The numbers "+b+" and "+c+" are not amicable numbers.");
	}

}
