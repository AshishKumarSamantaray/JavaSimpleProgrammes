import java.util.Scanner;
public class q7 {

	public static int count(String str)
	{int count = 0;
	for(int i=0;i<str.length();i++)
	{if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	count++;
	}
	return count;}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = sc.next();
		System.out.println("The number of vowels in the word \""+word+"\" is "+count(word));
		

	}

}
