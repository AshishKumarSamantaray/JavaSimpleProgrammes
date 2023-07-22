
public class Q1command {

	public static void main(String[] args)
	{
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int quotient = a/b;
		int remainder=a%b;
		System.out.println("The quotient for the numbers provided in the command line is "+quotient);
		System.out.println("The remainder for the numbers provided in the command line is "+remainder);
		

	}

}
