import java.util.*; 
public class EvenOddConditional
{ 
   public static void main(String x[]) 
   { Scanner xyz  = new Scanner(System.in); 
 int no; 
 String result; 
System.out.println("enter the values "); 
 no=xyz.nextInt(); 
 result=no%2==0?"Even":"Odd"; 
 System.out.printf("Result is %s\n",result); 
   } 
}
