import java.util.Scanner;
public class FactorialRecursion
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int factorial=Result(n);
		System.out.println("THe factorial of "+n+" is "+factorial);
	}
	public static int Result(int n)
	{
		if (n>=1)
		return n*Result(n-1);
		else
		return 1;
	}
}
