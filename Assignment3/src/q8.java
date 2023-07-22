import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		System.out.println("Enter the x coordinate:");
		Scanner sc = new Scanner (System.in);
		double x = sc.nextDouble();
		System.out.println("Enter the y coordinate:");
		double y = sc.nextDouble();
		
		if(x==0 || y==0)
		{if(x==0&&y!=0)
		{System.out.println("The point lies on y axis");}
		else if (y==0&&x!=0)
		{System.out.println("The point lies on the x axis.");}
		else if (x==0&&y==0)
		{System.out.println("Ther point is itself the origin.");}
		else{}}
		
		
		
		else
		{if(x>0&&y>0)
		{System.out.println("The point lies in the first quadrant.");
		}
		else if(x<0&&y>0)
		{System.out.println("The point lies in the second quadrant.");
		}
		else if(x<0&&y<0)
		{System.out.println("The point lies in the third quadrant.");
		}
		else 
		{System.out.println("The point lies in the fourth quadrant.");
		}
	}

}}

