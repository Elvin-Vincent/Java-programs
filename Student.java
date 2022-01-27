import java.util.Scanner;
public class Student
{
	public static void main(String args[])
	{
		int roll_no;
		String name,sem;
		double cgpa;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the roll number");
		roll_no=sc.nextInt();
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter the semester");
		sem=sc.next();
		System.out.println("Enter the CGPA");
		cgpa=sc.nextDouble();
		System.out.println("The details of the student: ");
		System.out.println("Roll no  : "+roll_no);
		System.out.println("Name     : "+name);
		System.out.println("Semester : "+sem);
		System.out.println("CGPA     : "+cgpa);
	}
}
