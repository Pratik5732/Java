import java.util.Scanner;
public class Reverse 
{
    public static void main(String x[])
    {
        String s;
        String rev="";
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int l = s.length();
        System.out.println("The length is "+l);
        for(int i=l-1; i>=0; i--)
        {
            rev = rev + s.charAt(i);
        }
       System.out.println("The reverse string is "+rev);   
    }
}  
