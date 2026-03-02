import java.util.*;
public class odd{
    public static void main(String x[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }
    }

}
