import java.util.Scanner;
public class SwapWithout {
public static void main(String [] args)
{
int a,b;
Scanner s = new Scanner (System.in);
System.out.println("Enter two integers = ");
a=s.nextInt();
b=s.nextInt();

a = a + b;
b = a - b;
a = a - b;
System.out.println("After swaping");
System.out.println(a+" "+b);
}
}