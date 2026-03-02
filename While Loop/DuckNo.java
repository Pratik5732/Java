import java.util.*;
public class duckno
{
    public static void main(String x[])
    {   
        int no;
        int rem;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        no=sc.nextInt();
        while(no>0)
        {
            rem=no%10;
            no=no/10;
            if(rem==0)
            {
                flag=true;
                break;
            }
        }
           if(flag)
           {
            System.out.println("number is duck");
           }
           else
           {
            System.out.println("number is not duck");
           }
        }
    }
