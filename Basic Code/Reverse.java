import java.util.Scanner;
public class reverse {
    public static void main(String x[]){
        int n;
        int rem;
        int rev=0;
        System.out.println("enter the no");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
              rem=n%10;
              n=n/10;
              rev=rev*10+rem;
        }  
        System.out.println(rev);
    } 
}
