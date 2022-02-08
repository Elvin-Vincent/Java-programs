import java.util.*;
public class StrSort
{
    public static void main(String arr[])
    {
        int n, i;
        Scanner sc= new Scanner (System.in);
        String sentence[];
        System.out.println("Enter the number of strings to enter:");
        n= sc.nextInt();
        sentence= new String [n];  
        System.out.println("Enter the strings:");
        sc.nextLine();  
        for(i= 0; i< n; i++)
        sentence[i]= sc.nextLine();
        System.out.println("The sorted array is:");
        Arrays.sort(sentence);
        for (String str: sentence)
        System.out.println(str);
    }
}


