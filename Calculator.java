import java.util.Scanner;
public class Calculator
{
  public static void main(String[] args) 
  {
    char op;
    Double num1,num2,ans;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter first number");
    num1=sc.nextDouble();
    System.out.println("Choose an operator: +, -, *, or /");
    op=sc.next().charAt(0);
    System.out.println("Enter second number");
    num2=sc.nextDouble();
    switch(op)
    {
      case'+':
        ans=num1+num2;
        break;
      case'-':
        ans=num1-num2;
        break;
      case'*':
        ans=num1*num2;
        break;
      case'/':
        ans=num1/num2;
         break;
         default:
        System.out.println("ERROR! Enter the correct operator");
        return;
        
    }
     System.out.println("The final result : "+num1+" "+op+" "+num2+" = "+ans);
  }
}
