import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		int a=((int)( Math.random()*9))+1;
		System.out.println("\\\\\\\\\\\\\\\\Welcome to the guessing game////////////////");
		System.out.println("Lets see how much you are good at guessing");
		System.out.println("I have thought a number, now you guess it");
		
		System.out.println("Enter your number between 1 and 9");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		System.out.println("The number thought by me was "+a);
		if (a==b)
		{System.out.println("You got it right!!!");}
		else if (a==b+1||a==b-1)
		{System.out.println("Almost got it!!!");}
		else {System.out.println("You got it wrong!!!");}
		

	}

}
