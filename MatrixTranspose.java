import java.util.Scanner;
public class MatrixTranspose
{
	public static void main(String args[])
	{
		int i,j,m,n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of rows");
		m=sc.nextInt();
		System.out.println("Enter the number of coloumns");
		n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the elements");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();
			System.out.println();
		}
		System.out.println("The transpose of the matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
		{
		System.out.print(a[j][i]+"\t");
		}
		System.out.println(" ");
		}
	
	}
}
		
