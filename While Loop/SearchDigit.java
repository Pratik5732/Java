import java.util.*;
public class searchdigit
{
    public static void main(String x[])
    {   
        int no,rem,sdigit;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        no=sc.nextInt();
        System.out.println("enter search digit");
        sdigit=sc.nextInt();
        while(no>0)
        {   
            rem=no%10; 
            no=no/10;
            if(rem==sdigit)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("digit found");
        }
        else
        {
            System.out.println("digit not found");
        }
    }
}
