import java.util.Scanner;
public class Natural
{
	public static void main(String args[])
	{
		int i,s=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt(); 
		for (i=1;i<=n;i++)
		{
			s=s+i;
		}
		System.out.println("the sum ="+s);
	}
}
