

public class Q7 {

	public static void main(String[] args) {
		//Write a java program that displays the following table. Cast floating-point numbers into following
		int a=1;
		int b=a+1;
		int c = (int)Math.pow(a, b);
		System.out.println("A          B          pow(A,B)");
		System.out.println(a+"          "+b+"          "+c);
		a=a+1;//a=2
		b=a+1;//b=3
		c = (int)Math.pow(a, b);
		System.out.println(a+"          "+b+"          "+c);
		a=a+1;//a=4
		b=a+1;
		c = (int)Math.pow(a, b);
		System.out.println(a+"          "+b+"          "+c);
		a=a+1;
		b=a+1;
		c = (int)Math.pow(a, b);
		System.out.println(a+"          "+b+"          "+c);
		a=a+1;
		b=a+1;
		c = (int)Math.pow(a, b);
		System.out.println(a+"          "+b+"          "+c);
		
	}

}
