import java.util.Scanner;
public class BinnarySearch
{
	public static void main(String args[])
	{
		 int i,n,item,first,mid,last;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of elements:");
		 n=sc.nextInt();
		 int a[]=new int[n];
		 System.out.println("Enter the elements in ascenting order:");
		 for(i=0;i<n;i++)
		 a[i]=sc.nextInt();
		 System.out.println("Enter the item to be searched:");
		 item=sc.nextInt();
		 first=0;
		 last=n-1;
		 mid=(first+last)/2;
		 while(first<=last)
		 {
			 if(item<a[mid])
			 last=mid-1;
			 else if(item==a[mid])
			 {
			 System.out.println("The item "+item+" found at the location "+(mid+1));
			 break;
		 }
			 else if(item>a[mid])
			 first=mid+1;
			 mid=(first+last)/2;
		 }
		 if(last<first)
		 System.out.println("Item not found");
	 }
 }
