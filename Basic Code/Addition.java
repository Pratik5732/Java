import java.util.Scanner;
public class Addition
{
     public static void main(String x[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no ");
        a=sc.nextInt();
        System.out.println("enter the second no ");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Addition is " + c);
    }
}
