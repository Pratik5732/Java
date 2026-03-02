import java.util.*;
public class countdigits
{
    public static void main(String x[])
    {
        int n;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no ");
        n=sc.nextInt();
        while(n>0)
        {
           n=n/10;
           count++;
        }
        System.out.println("count is "+count);
    }
}
