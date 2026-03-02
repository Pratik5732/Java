import java.util.Scanner;
public class swap
{
    public static void main(String x[])
    {
        int a,b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no");
        a=sc.nextInt();
        System.out.println("enter the second no");
        b=sc.nextInt();
        System.out.println("before swapping a:" + a);
        System.out.println("before swapping b:" + b);
        c=a;
        a=b;
        b=c;
        System.out.println("after swapping a:" + a);
        System.out.println("after swapping b:" + b);

    }
}
