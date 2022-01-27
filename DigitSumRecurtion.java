import java.util.Scanner;
public class DigitSumRecurtion
{
	
	public static void main(String args[])
	{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	n=sc.nextInt();
	int sum= Add(n);
	System.out.println("The sum of the digit = "+sum);
    }
	public static int Add(int n)
	{
		int s;
		s=n%10;
		if(n==0)
			return 0;
		else
		return s=s+Add(n/10);
	}
}

