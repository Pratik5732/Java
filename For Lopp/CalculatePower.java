import java.util.*;
public class calculatepower
{
    public static void main(String x[])
    {
        int n;
        int p;
        int result=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no ");
        n=sc.nextInt();
        System.out.println("enter the power ");
        p=sc.nextInt();
        System.out.println("The power is ");
        for(int i=1; i<=p; i++)
        {
          result=result*n;
        }
        System.out.println(result);
    }
}
