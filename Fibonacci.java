import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		int i,f=0,s=1,t,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		System.out.println("The fibonacci Series :");
		System.out.println(f);
		System.out.println(s);
		for(i=2;i<n;i++)
		{
			t=s+f;
			System.out.println(t);
			f=s;
			s=t;
		}
	}
}
