import java.util.Scanner;
public class LargestArray
{
	public static void main(String args[])
	{
		int i,n,large;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements");
	    n=sc.nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter the elements");
	    for(i=0;i<n;i++)
	    a[i]=sc.nextInt();
	    large=a[0];
	    for(i=0;i<n;i++)
	    {
			if(large<a[i])
			large=a[i];
		}
		System.out.println("The largest element in the array is "+large);
	}
}
	    
