import java.util.Scanner;
public class charremove 
{
    public static void main(String x[])
    {
        String s;
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        String ss="";
        System.out.println("Enter the character for remove");
        char ch = sc.next().charAt(0);
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=ch)
            {
                ss=ss+s.charAt(i);
            }
        }
        System.out.println("The new string is "+ss);
    }
}
