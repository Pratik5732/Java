import java.util.*;
public class primeno
{
    public static void main(String x[])
    {
        int no;
        int rem,i;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        no=sc.nextInt();
        i=2;
        while(i<no)
        {
            rem=no%i;
            if(rem==0)
            {
                flag=false;
                break;
            }
            i++;
        }
        if(flag)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }
}
