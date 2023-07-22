import java.util.Scanner;

public class q5hw {

	public static void main(String[] args) {
		/*If the person is male and 20 or
over, display "Mr." in front of his name. Otherwise, display his first and last name. Note
that asking a person if they are married should only be done if they are female and 20
or older, which means you will have a single if and else nested inside one of your if
statements. Also, did you know that with an if statements (or else), the curly braces are
optional when there is only one statement inside?*/
		System.out.println("What is your Gender?(M or F)");
		Scanner sc = new Scanner(System.in);
		char g= sc.next().charAt(0);
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is your first name?");
		String fn= sc.next();
		System.out.println("What is your middle name?");
		String mn=sc.next();
		System.out.println("What is your last name?");
		String ln = sc.next();
		
		if(g=='F'&&age>=20)
		{System.out.println("Whether you are married or not?(Y or N)"); 
		char m = sc.next().charAt(0);
		if (m=='Y'||m=='y')
		System.out.println("Mrs. "+fn+" "+mn+" "+ln);
		else 
		System.out.println("Ms. "+fn+" "+ln);}
		else if(g=='F'&&age<20)
		System.out.println(fn+" "+ln);
		else if(g=='M'&&age>=20)
		System.out.println("Mr. "+fn+" "+mn+" "+ln); 
		else
		System.out.println(fn +" "+ ln);
		
	
	}

}
