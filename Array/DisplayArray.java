import java.util.*;
public class displayarr
{
    public static void main(String x[])
    {
        int a[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elemnts");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("display array elements");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
