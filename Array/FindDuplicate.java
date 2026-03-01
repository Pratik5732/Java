import java.util.Scanner;
public class findduplicate 
{
    public static void main(String[] args)
    {
        int a[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The elements is");
       for(int i=0;i<a.length;i++)
        {
        System.out.println(a[i]);
        }
        System.out.println("Duplicate elements:");
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++) 
            {
                if (a[i] == a[j])
               {
                    System.out.println(a[i]);
                    break;
               }
            }   
        } 
    }
}
 
