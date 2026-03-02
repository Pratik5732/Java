import java.util.Scanner;
public class removeword 
{
    public static void main(String x[])
    {
        String s;
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        String w;
        System.out.println("Enter the word for remove");
        w=sc.nextLine();
        String a=s.replace(w,"");
        System.out.println("After the remove word "+ a);
    }
}
