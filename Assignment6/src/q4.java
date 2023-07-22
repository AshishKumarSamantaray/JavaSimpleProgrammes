
public class q4 {
	public static int numberOfDaysInAYear(int year)
	{if ((year%4==0&&year%100!=0)||year%400==0)return 366;
	else return 365;}
	
	public static void main(String[] args) {
		int days = 0;
		for (int i = 2000;i<=2020;i++)
		{days = days+ numberOfDaysInAYear(i);}
		System.out.println("The number of days in year from 2000 to 2020 is "+days);

	}}
