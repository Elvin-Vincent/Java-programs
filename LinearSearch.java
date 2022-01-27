import java.util.Scanner;
public class LinearSearch
{
	public static void main(String args[])
	{
		int i,n,item,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println("Enter the item to be searched");
		item=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(item==a[i])
			{
				System.out.println("The item "+item+" found on the location "+(i+1));
				f=1;
				break;
			}
		}
		if(f==0)
		System.out.println("The item "+item+" not found");
	}
}
