import java.util.*;
public class reverse
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int no,rem,rev=0;
        System.out.println("enter no");
        no=sc.nextInt();
        while(no>0) 
        {
            rem=no%10;
            no=no/10;
            rev=rev*10+rem;
        }
        System.out.println("reverse is " + rev);
    }
}
 
