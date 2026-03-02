import java.util.*;
public class sum
{
    public static void main(String x[])
    {
        int n;
        int i=1;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        n=sc.nextInt();
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
