import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		System.out.println("Enter the number of units of electricity:");
		Scanner sc = new Scanner (System.in);
		int e = sc.nextInt();
		double b;
		if(e<=50) 
		{b=e*3;
		System.out.println("The electricity bill is "+b);}
		else if(e>50&&e<200) 
		{b=50*3+(e-50)*4.80;
		System.out.println("The electricity bill is "+b);}
			
		else if(e>=200&&e<=400) 
		{b=50*3+150*4.80+(e-200)*5.80;
		System.out.println("The electricity bill is "+b);}
		
		else if(e>400) 
		{b=50*3+150*4.80+200*5.80+(e-400)*6.20;
		System.out.println("The electricity bill is "+b);}
		
		else {}
}

}
