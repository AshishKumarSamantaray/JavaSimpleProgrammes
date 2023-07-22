import java.util.Scanner;
public class q9 {
	
	public static boolean pass(String str)
	{if(str.length()<8)return false;
	String str1=str.toLowerCase();
	int count = 0;
	for(int i =0;i<str1.length();i++)
	{if(!((str1.charAt(i)>='a'&&str1.charAt(i)<='z')||(str1.charAt(i)>='0'&&str1.charAt(i)<='9')))
	return false;
	
	if(str1.charAt(i)>='0'&&str1.charAt(i)<='9')
	count++;}
	
	if(count<2)return false;
	return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password:");
		String pw = sc.next();
		if(pass(pw))System.out.println("The passsword is valid");
		else System.out.println("The password is invalid");

	}}
