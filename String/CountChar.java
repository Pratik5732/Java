import java.util.Scanner;
public class countchar
{
    public static void main(String x[])
    {
       String s;
       int count=0;
       System.out.println("Enter the string ");
       Scanner sc = new Scanner(System.in);
       s=sc.nextLine();
       int l=s.length();
       System.out.println("The length is "+l);
       for(int i=0; i<l; i++)
       {
         if(s.charAt(i)!=' ')
         {
            count++;
         }
       }
       System.out.println("The count of string is "+ count);
    }
    
}
