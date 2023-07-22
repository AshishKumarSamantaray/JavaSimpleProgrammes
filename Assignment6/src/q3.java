import java.util.Scanner;
public class q3 {
	
	public static int reverse(int a)
	{int rev = 0;
	while(a>0)
	{rev=(rev*10)+a%10;
	a/=10;}
	return rev;}
	
	public static boolean isPalindrome(int a)
	{if(reverse(a)==a)return true;
	else return false;}
	
	public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("The reversed number is "+reverse(a));
	if(isPalindrome(a))System.out.println("The giver number is a palindrome number.");
	else System.out.println("The given number is not a palindrome number");

	}}
