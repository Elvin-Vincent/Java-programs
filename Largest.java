import java.util.Scanner;
public class Largest
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		if(x>y)
		System.out.println(x+" is the largest number");
		else
		System.out.println(y+" is the largest");
	}
}
