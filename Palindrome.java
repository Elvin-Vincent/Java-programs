import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		int n,c,rem,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		c=n;
		while(n!=0)
		{
			rem=n%10;
			s=s*10+rem;
			n=n/10;
		}
		if(s==c)
		System.out.println(c+" is a palindrome");
		else
		System.out.println(c+" is not a palindrome");
	}
}
			
