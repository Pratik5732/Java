import java.util.*;
public class checkprimeno {
    public static void main(String x[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no");
        n = sc.nextInt();

        // 1 se n tak check karna
        for(int num = 1; num <= n; num++) {

            int count = 0;

            // ek number prime hai ya nahi check karna
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }

            if(count == 2) { 
                System.out.println(num); // prime number print
            }
        }
    }
}
