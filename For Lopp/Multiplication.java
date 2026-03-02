import java.util.Scanner;
public class multiplication
{
    public static void main(String x[])
    {
        int n;
        int mul;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            mul=n*i;
            System.out.println(mul);
        }
    }
}
