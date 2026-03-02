import java.util.Scanner;
public class multable
{
    public static void main(String x[])
    {
        int n;
        int i=1;
        int mul;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        while(i<=10)
        {
            mul=n*i;
            i++;
             System.out.println(mul);
        }
    }
}
