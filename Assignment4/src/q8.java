import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		/*Write a program that generates a random integer number between 1 to 10 
		 * and asks the user to
		guess what the number is. If the user's guess is higher than the random 
		number, the program
		should display "Too high, try again." If the user's guess is lower than 
		the random number, the
		program should display "Too low, try again." The program should use a 
		loop that repeats until
		the user correctly guesses the random number and display good guess.*/
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*10)+1;
		for(;;)
		{System.out.println("Try to guess the number:-");
		int x = sc.nextInt();
		if(x>a)
		{System.out.println("The number is too high");
		continue;
		}
		else if(x<a) 
		{System.out.println("The number is too high");
		continue;
		}
		else {break;}}
		System.out.println("You guessed the number right");
	}

}
