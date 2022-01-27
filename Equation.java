import java.util.Scanner;
public class Equation
{
	public static void main(String args[])
	{
		double a,b,c,d,x1,x2,x,r,im;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the coefficient of X^2");
		a=sc.nextDouble();
		System.out.println("Enter the coefficient of x");
		b=sc.nextDouble();
		System.out.println("Enter the constant");
		c=sc.nextDouble();
		d=b*b-(4*a*c);
		if(d>0)
		{
			System.out.println("The roots are real and diffrent");
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("The roots are "+x1+" and "+x2);
		}
		else if(d==0)   
        {
		    System.out.println("The roots of thr equation are real and same");  
            x =-b/(2*a);
            System.out.println("The root is " + x);  
         }   
         else   
        {  
            System.out.println("The roots of the equation are imaginary and different");
            r=-b/(2*a);
            im=(Math.sqrt(-d))/(2*a);
            System.out.println("The roots are "+r+" +"+im+"i and "+r+" -"+im+"i");  
        }  
    }  
}  
		
