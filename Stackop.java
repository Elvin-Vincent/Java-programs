import java.util.Stack;
import java.util.Scanner;
public class Stackop
{
	public static void main(String args[])
	{
		int c=0;
		Stack<Integer>s=new Stack<>();
		while(c!=4)
		{
			int n;
			System.out.println("Enter the operation \n 1.push \n 2.pop \n 3.show \n 4.exit");
			Scanner sc=new Scanner(System.in);
			c=sc.nextInt();
			switch(c)
			{
				case 1 :System.out.println("Enter the number");
						n=sc.nextInt();
						s.push(n);
						System.out.println("The Element "+s.peek()+" inserted");
						break;
				case 2 : System.out.println("The element poped"+s.pop());
						break;
				case 3: System.out.println(s);
						break;
				case 4 :break;
				default : System.out.println("Enter correct choise");
			}
		}
	}
}
				
