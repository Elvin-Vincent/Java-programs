import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String args[])
	{
		int r1,r2,c1,c2,i,j,k;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of  rows for Matrix1");
		r1=sc.nextInt();
		System.out.println("Enter the number of coloumns for Matrix1");
		c1=sc.nextInt();
		System.out.println("Enter the number of rows for Matrix2");
		r2=sc.nextInt();
		System.out.println("Enter the number of coloumns for Matrix2");
		c2=sc.nextInt();
		if(c1==r2)
		{
			int mat1[][]=new int[r1][c1];
			int mat2[][]=new int[r2][c2];
			int res[][]=new int[r1][c2];
			System.out.println("Enter the elements for the Matrix1");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				mat1[i][j]=sc.nextInt();
				System.out.println();
			}
			System.out.println("Enter the elements for the Matrix2");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				mat2[i][j]=sc.nextInt();
				System.out.println();
			}
			System.out.println("The result matrix:");
				for(i=0;i<r1;i++)
				{
					for(j=0;j<c2;j++)
					{
						for(k=0;k<r2;k++)
						res[i][j]=res[i][j]+mat1[i][k]*mat2[k][j];
					}
				}
				for(i=0;i<r1;i++)
				{
					for(j=0;j<c2;j++)
					System.out.print(res[i][j]+"\t");
					System.out.println();
				}
			}
			else
			System.out.println("Multiplication does not exist");
		}
	}
						
