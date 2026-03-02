import java.util.*;
public class factno
{
    public static void main(String x[])
    {
        int i=1;
        int no;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        no=sc.nextInt();
        while(i<=no)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("factorial is " + fact);

    }
}
