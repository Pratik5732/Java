import java.util.Scanner;
public class countword 
{
    public static void main(String x[])
    {
        String s;
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        String ss []=s.trim().split("\\s+");
        System.out.println("The count of word is "+ss.length);
    }
}
