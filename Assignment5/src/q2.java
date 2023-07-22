import java.util.Scanner;
public class q2 {
	static boolean prime(int num)
	{boolean i = true;
	for(int div =2;div<=num/2;div++)
	{if(num%div==0)
	{i=false;break;}
	}
	return i;
	}
	
	public static void main(String[] args) {
		/*WAP to check whether a number is twisted prime or not. Twisted prime 
		 * is a number if the number and its reverse both are 
		 * prime then it is called twisted prime.
		 */
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int rev = 0;
		while(a>0)
		{int dig = a%10;
		 rev=rev*10+dig;
		 a/=10;
		}
		if(prime(a)&&prime(rev))
		System.out.println("The numbers are twisted primes.");
		else
		System.out.println("The numbers are not twisted primes.");
	}}
