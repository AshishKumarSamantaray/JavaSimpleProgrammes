import java.util.Scanner;
public class q2 {
	public static int getPentagonalNumber(int n) {return (n*(3*n-1))/2;}
	public static void main(String[] args) {
	for(int i =1;i<=100;i++)
	{if(i%10==0)System.out.println(" "+getPentagonalNumber(i));
	else System.out.print(" "+getPentagonalNumber(i));
	}}}
