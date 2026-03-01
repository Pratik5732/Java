import java.util.Scanner;
public class checkevenodd
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
        System.out.println("The elements is");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Even and Odd elements:");
        for(int i = 0; i < a.length; i++)
         { 
            if(a[i] % 2 == 0) 
            {
                System.out.println(a[i] + " = Even");
            }
            else 
            {
                System.out.println(a[i] + " = Odd");
            }
        }
    }
}
