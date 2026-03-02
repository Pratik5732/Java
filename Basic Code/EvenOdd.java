import java.util.*;
public class EvenOdd
{
    public static void main(String x[])
    {
        int no,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        no=sc.nextInt();
        rem=no%2;
        if(rem==0)
        {
            System.out.println("no is even");
        }
        else
        {
            System.out.println("no is odd");
        }
    }
}
