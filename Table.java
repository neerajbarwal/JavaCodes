import java.util.Scanner;
public class Table{
	public static void main (String[] args){
		
		int x,i=1;
		System.out.println("Enter a number =");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		
		while(i<=10)
		{
			System.out.println(x+" * "+i+" = "+ x*i);
			i++;
		}
		
	}
}