import java.util.Scanner;
public class maxarr
{
    public static void main(String x[])
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The elements is ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("max is " +max);
    }
}
