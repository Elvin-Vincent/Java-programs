import java.util.Scanner;
public class Add
{
	public static void main(String args[])
	{
		int x,y,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		s = x + y;
		System.out.println("The sum = "+s);
	}
}
