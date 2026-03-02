import java.util.Scanner;
public class removespace 
{
    public static void main(String x[])
    {
        String s;
        System.out.println("Enter the string from user ");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        String p=s.replace(" ","");
        System.out.println(p);
    }
}
