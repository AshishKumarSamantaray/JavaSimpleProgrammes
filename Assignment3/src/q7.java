import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		double b ;
		System.out.println("No. of units consumed:");
		Scanner sc = new Scanner (System.in);
		int e = sc.nextInt();
		
		if(e<=50) 
		{ b=e*3;
		}
		else if(e>50&&e<200) 
		{ b=50*3+(e-50)*4.80;
		}
			
		else if(e>=200&&e<=400) 
		{ b=50*3+150*4.80+(e-200)*5.80;
		}
		
		else if(e>400) 
		{ b=50*3+150*4.80+200*5.80+(e-400)*6.20;
		}
		
		else {b=0;}
		
		System.out.println("Do you want to pay the bill online(Type y for yes and type n for no):");
		char reply=sc.next().charAt(0);
		
		if(reply=='y') 
		{System.out.println("Total amount:"+b);
		System.out.println("Discount:"+(b*0.03));
		double c = b-(0.03*b);
		System.out.println("Amount payable:"+b);
		}
		else {System.out.println("Total amount:"+b);}
		
		
		
	}

	}


