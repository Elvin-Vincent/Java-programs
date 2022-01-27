import java.util.Scanner;
public class Perfect
{
	public static void main(String args[])
	{
		int rem,n,s=0,c,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		c=n;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			s=s+i;
		}
		if(c==s)
		System.out.println(c+" is a perfect number");
		else
		System.out.println(c+" is not a perfect number");
	}
}
		
			

	
