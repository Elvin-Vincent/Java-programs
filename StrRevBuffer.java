import java.util.Scanner;
public class StrRevBuffer
{
	public static void main(String args[])
	{
		String sentence;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		sentence=sc.nextLine();
		StringBuffer sbf=new StringBuffer(sentence);
		sbf.reverse();
		System.out.println("The reverse of the string is "+sbf);
	}
}
