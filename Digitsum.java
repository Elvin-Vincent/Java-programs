import java.util.Scanner;
public class Digitsum
{
	public static void main(String args[])
	{
	int rem,s=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	n=sc.nextInt();
	while(n!=0)
	{
		rem=n%10;
		s=s+rem;
		n=n/10;
	}
	System.out.println("The sum of the numbers is = "+s);
}
}
