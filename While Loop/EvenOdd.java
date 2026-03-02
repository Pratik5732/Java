import java.util.*;
public class evenodd
{
    public static void main(String x[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even no");
        }
        else
        {
            System.out.println("Odd no");
        }
    }
}
