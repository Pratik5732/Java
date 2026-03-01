import java.util.Scanner;
public class ascending
{
    public static void main(String x[])
    {
      int a[]=new int[5];
      int temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the elements");  
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      System.out.println("The elements is ");
      for(int i=0;i<a.length;i++)
      {
        System.out.println(a[i]);
      }
      for(int i=0;i<a.length;i++)
      {
        for(int j=i+1;j<a.length;j++)
        {
           if(a[i]>a[j])
           { 
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
           }
        }
      }
      System.out.println("ascending element is");
      for(int i=0;i<a.length;i++)
      {
        System.out.println(a[i]);
      }
    }
}
