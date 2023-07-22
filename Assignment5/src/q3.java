import java.util.Scanner;
public class q3 {
	static boolean prime(int num)
	{boolean i = true;
	for(int div =2;div<=num/2+1;div++)
	{if(num%div==0)
	{i=false;break;}
	}
	return i;
	}


	public static void main(String[] args) {
		/*WAP to enter the first number and second number.
		 *  Display the prime numbers between the first and second number.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int j= Math.min(a,b);j<=Math.max(a, b);j++)
		{if (j==2)
			{System.out.print(j+" ");
			continue;}
		else if (prime(j))
			System.out.print(j+" ");
		}}}