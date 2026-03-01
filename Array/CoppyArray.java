import java.util.Scanner;
public class coppyarr
{
    public static void main(String x[])
    {
        int a[]=new int[5];
        int b[]=new int[a.length];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The elements of a is");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println("copied elements is a to b");
        for(int i=0;i<a.length;i++)
        {
            System.out.print( " "+b[i]);
        }
     }   
 }
   
