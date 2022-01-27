import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		int i,n,c=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			c=1;
		}
		if(c==0)
		System.out.println(n+" is a prime number");
		else
		System.out.println(n+" is not a prime number");
	}
}


