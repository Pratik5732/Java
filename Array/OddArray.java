import java.util.Scanner;
public class oddarr
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
        System.out.println("odd elements in the array");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==1)
            {
                System.out.println(a[i]);
            }
        }
    }
}
