import java.util.Scanner;
public class Palindrome {
    public static void main(String x[]){
        int n;
        int rem;
        int rev=0;
        System.out.println("enter the no");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int c=n;
        while(c>0){ 
            rem=c%10;
            rev=rev*10+rem;
            c=c/10;  
        }
        if(rev==n){
            System.out.println("it is a palindrome no");
        }
        else{
            System.out.println("it is not plaindrome no");
        }
    }
}
