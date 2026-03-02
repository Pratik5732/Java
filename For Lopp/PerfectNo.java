import java.util.*;
public class Perfectno
{
    public static void main(String x[])
    {
        int n;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum+i;
            }
        }
        if(n==sum)
        {
            System.out.println("Perfect no");
        }
        else
        {
            System.out.println("Not perfect no");
        }
    }
}
