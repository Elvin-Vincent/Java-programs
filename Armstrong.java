//armstrong number
import java.util.Scanner;
public class Armstrong
 {

    public static void main(String[] args) 
    {
		int n,c,rem,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        c=n;

        while (n!=0)
        {
            rem=n%10;
            s=s +rem*rem*rem;
            n/= 10;
        }

        if(s==c)
            System.out.println(c+ " is an Armstrong number.");
        else
            System.out.println(c+ " is not an Armstrong number.");
    }
}
