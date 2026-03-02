import java.util.Scanner;
public class oddnosum
{
    public static void main(String x[])
    {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
           if(i%2==1)
           {
              System.out.println(i);
              sum=sum+i;
           }
        }
         System.out.println("The sum is " + sum);
    }
}
