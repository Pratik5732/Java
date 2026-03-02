import java.util.*;
public class sumofdigit
{
    public static void main(String x[])
    {
        int n,rem;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("sum of digit " +sum);

    }
}
