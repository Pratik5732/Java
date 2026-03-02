import java.util.*;
public class factorial
{
    public static void main(String x[])
    {
        int n;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
            System.out.println("factorial is " + fact);
    }
}
