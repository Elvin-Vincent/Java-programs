import java.util.Scanner;
public class Reverse
{
	public static void main(String args[])
	{
		int rev=0,rem,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("The reverse of the number = "+rev);
	}
}
