
public class Q3command {

	public static void main(String[] args) {
		//Write a java program that prints the sum of two random integers between 1 and 6 (such as
		//you might get when rolling dice)
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		double c = Math.random()*(b-a+1);//answer will be between 0 and 1
		
		double d = Math.random()*(b-a+1);//answer will be between 0 and 1
		int r =(int)c+1+(int)d+1;
		System.out.println("The summation of the observations is "+r);
		//max - min + 1 will be the desired range and then we add 1 to get the value of our desired range
		
		
		

}}
