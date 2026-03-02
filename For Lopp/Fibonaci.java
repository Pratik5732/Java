import java.util.Scanner;
public class fibonaci 
{
    public static void main(String x[])
    {
        int a=0,b=1;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        System.out.print(a+" "+b);
        int c;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
