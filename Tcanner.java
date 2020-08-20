import java.util.Scanner;
public class Tcanner
{
	public static void main (String[] args)
	{
		int Rollno;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Rollno.- ");
		Rollno= s.nextInt();
		
		System.out.println("Your Roll no. is -" + Rollno);
	}
}