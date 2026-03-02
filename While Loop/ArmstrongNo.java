import java.util.*;
public class Armstrong
{
    public static void main(String x[])
    {
        int n;
        int arm=0;
        int rem,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        c=n;
        while(c>0)
        {
            rem=c%10;
            arm=rem*rem*rem+arm;
            c=c/10;
        }
        if(n==arm)
        {
            System.out.println("armstrong no");
        }
        else
        {
            System.out.println("not armstrong no");
        }
    }
}
