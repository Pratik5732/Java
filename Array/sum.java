import java.util.Scanner;
public class arrsum
{
    public static void main(String x[])
    {
        int a[]=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("display elements");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(" " +a[i]);
            sum=sum+a[i];
        }
        System.out.println("sum is " +sum);
    }
}
