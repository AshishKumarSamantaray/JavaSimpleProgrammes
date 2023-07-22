import java.util.Scanner;

public class q2 {

	public static void main(String[] args) 
	{System.out.println("Enter the number: ");
	Scanner sc = new Scanner (System.in);int a=sc.nextInt();
	int r = 0; 
	int sum=0;
	while(a!=0)
	{r=a%10;sum=sum+r;a=a/10;}
	System.out.println(" sum of digits of a number is "+sum);
	if (sum%9==0)
	System.out.println("The number is divisible by 9"); 
	else System.out.println("The number is not divisible by 9");
}}
