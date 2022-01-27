import java.util.Scanner;
public class MatrixAddition
{
	public static void main(String args[])
	{
		int i,j,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		m=sc.nextInt();
		System.out.println("Enter the number of coloumns");
		n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		System.out.println("Enter the elements for the 1st matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
			System.out.println();
		}
		System.out.println("Enter the elements for the 2nd matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			b[i][j]=sc.nextInt();
			System.out.println();
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			c[i][j]=a[i][j]+b[i][j];
		}
		System.out.println("The sum=");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			System.out.print(c[i][j]+"\t");
			System.out.println();
		}
	}
}
		
		
