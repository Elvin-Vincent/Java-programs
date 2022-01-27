import java.util.Scanner;
public class Swap
{
	public static void main(String args[])
	{
		int x,y,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		System.out.println("BEFORE SWAPPING");
		System.out.println("First number = "+x);
		System.out.println("Secont number = "+y);
		t=x;
		x=y;
		y=t;
		System.out.println("AFTER SWAPPING");
		System.out.println("First number becomes "+x);
		System.out.println("Second number becomes "+y);
	}
}
	
