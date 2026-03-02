import java.util.*;
public class perfect
{
    public static void main(String x[])
    {
        int no,rem;
        int sum=0;
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        no=sc.nextInt();
        while(i<no)
        {
            rem=no%i;
            if(rem==0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==no)
        {
            System.out.println("number is perfect");
        }
        else
        {
            System.out.println("number is not perfect");
        }
    }
}
