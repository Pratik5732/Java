import java.util.Scanner;
public class Palindrome 
{
    public static void main(String x[])
    {
        String s;
        String r="";
        System.out.println("Enter the string is ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int len = s.length();
        System.out.println("The length is "+len);
        for(int i=len-1; i>=0; i--)
        {
           r=r+s.charAt(i);
        }
        System.out.println("The reverse string is "+r);
        if(s.equals(r))
        {
            System.out.println("I am palindrome");
        }
        else 
        {
            System.out.println("I am not palindrome");
        }
    }
}
