import java.util.Scanner;
public class duplicateremove 
{
  public static void main(String x[])
  {
    String s;
    System.out.println("Enter the string");
    Scanner sc = new Scanner(System.in);
    s=sc.nextLine();
    String a="";
    for(int i=0;i<s.length();i++)
    {
      char ch = s.charAt(i);
      if(a.indexOf(ch)==-1)
      {
        a=a+ch;
      }
    }
    System.out.println("after deleting the string: "+a);
  }
}
