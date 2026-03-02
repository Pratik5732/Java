import java.util.Scanner;
public class swapwithout2
{
    public static void main(String x[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first no");
        a=sc.nextInt();
        System.out.println("enter the second no");
        b=sc.nextInt();
        System.out.println("Before swapping : a = " + a);
        System.out.println("Before swapping : b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping : a = " + a); 
        System.out.println("After swapping : b = " + b);
    }
}   
