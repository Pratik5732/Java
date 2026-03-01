import java.util.Scanner;
public class sumevenodd
{
    public static void main(String x[])
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int evensum=0,oddsum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                evensum=evensum+a[i];
            }
            else
            {
                oddsum=oddsum+a[i];
            }
        }
        System.out.println("even sum " +evensum);
        System.out.println("odd sum " +oddsum);
    }
}
