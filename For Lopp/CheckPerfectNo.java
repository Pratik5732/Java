import java.util.*;
public class checkperfectno
{
    public static void main(String x[])
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no");
        n = sc.nextInt();

        // 1 se n tak sab numbers check karna
        for(int num = 1; num <= n; num++)
        {
            int sum = 0;

            // num ke proper divisors ka sum nikalna
            for(int i = 1; i < num; i++)
            {
                if(num % i == 0)
                {
                    sum = sum + i;
                }
            }
            // perfect number check
            if(sum == num)
            {
                System.out.println(num);
            }
        }
    }
}
