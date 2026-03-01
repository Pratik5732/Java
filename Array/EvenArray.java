import java.util.Scanner;
public class evenarr
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
        System.out.println("even elements in the array");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
