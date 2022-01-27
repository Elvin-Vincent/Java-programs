import java.util.*;
public class ArraySort
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		Arrays.sort(a);
		System.out.println("The sorted array is:");
		for(int item : a)
		System.out.print(item+" ");
	}
}
