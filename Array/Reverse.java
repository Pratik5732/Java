import java.util.Scanner;
public class revarr
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
        System.out.println("The elements are");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Reverse elements are");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
