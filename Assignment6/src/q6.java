import java.util.Scanner;
public class q6 {
	
	public static int count(String str, char a)
	{int count = 0;
	for(int i = 0;i<str.length();i++)
	{ if(str.charAt(i)==a)count++;}	
	return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the word:");
		Scanner sc = new Scanner (System.in);
		String word= sc.next();
		System.out.println("Enter the character you want to count in the word:");
		char letter = sc.next().charAt(0);
		System.out.println("The number of \""+letter+"\" in the word \""+word+"\" is "+count(word,letter));
		
	}}
