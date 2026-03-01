import java.util.Scanner;
public class mergetwoarr
{
    public static void main(String x[])
    {
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first the elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
       System.out.println("enter the second elements");
       for(int i=0;i<a.length;i++)
       {
           b[i]=sc.nextInt();
       }
       int c[]=new int[a.length + b.length];
       for(int i=0;i<a.length;i++)
       {
          c[i]=a[i];
       }
       for(int i=0;i<b.length;i++)
       {
        c[a.length+i]=b[i];
       }
       System.out.println("merged array");
       for(int i=0;i<c.length;i++)
       {
        System.out.print( " "+c[i]);
       }
    }
}
