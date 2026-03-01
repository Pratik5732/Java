import java.util.Scanner;
public class movezero
{
    public static void main(String x[])
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)   
            {
                a[count]=a[i];
                count++;
            }
        }
        while(count<a.length)
        {
            a[count]=0;
            count++; 
        }
        System.out.println("After moving zeros:");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
