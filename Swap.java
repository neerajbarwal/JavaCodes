import java.util.Scanner;
public class Swap {
public static void main(String [] args)
{
int a,b,x;
Scanner s = new Scanner (System.in);
System.out.println("Enter two integers = ");
a=s.nextInt();
b=s.nextInt();

x=a;
a=b;
b=x;
System.out.println("After swaping");
System.out.println(a+" "+b);
}
}