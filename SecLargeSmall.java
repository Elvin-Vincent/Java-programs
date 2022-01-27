import java.util.Scanner;
public class SecLargeSmall
{
	public static void main(String args[])
	{
		int i,j,temp,n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The second largest of the array is "+a[n-2]);
		System.out.println("The second smallest of the array is "+a[1]);
	}
}

