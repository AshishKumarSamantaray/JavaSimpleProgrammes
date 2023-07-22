import java.util.Scanner;
public class q8 {
	
	public static String reverse(String str)
	{String rev= "";
	for(int i = str.length()-1;i>=0;i--)
	{rev = rev+str.charAt(i);}
	return rev;
	}
	
	public static boolean palindrome(String str)
	{if(str.equals(reverse(str)))
	return true;
	else return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = sc.next();
		System.out.println("The reverse of the word \""+word+"\" is " +reverse(word));
		if(palindrome(word))
			System.out.println("The given word is palindromic");
		else 
			System.out.println("The given word is not palindrome");

	}}
