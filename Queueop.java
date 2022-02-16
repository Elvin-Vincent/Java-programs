import java.util.*;
public class Queueop
{
	public static void main(String args[])
	{
		int c=0;
		Queue<Integer>s=new LinkedList<Integer>();
		while(c!=4)
		{
			int n;
			System.out.println("Enter the operation \n 1.Insert\n 2.poll \n 3.show \n 4.exit");
			Scanner sc=new Scanner(System.in);
			c=sc.nextInt();
			switch(c)
			{
				case 1 :System.out.println("Enter the number");
						n=sc.nextInt();
						s.add(n);
						System.out.println("The Element "+s.peek()+" inserted");
						break;
				case 2 : System.out.println("The element poped "+s.poll());
						break;
				case 3: System.out.println(s);
						break;
				case 4 :break;
				default : System.out.println("Enter correct choise");
			}
		}
	}
}
				
