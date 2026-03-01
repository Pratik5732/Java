import java.util.Scanner;
public class evenoddcount
 {
    public static void main(String[] args) 
    {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
    }
}
