import java.util.Scanner;
public class removeduplicate 
 {
    public static void main(String x[]) 
    {
        int a[] = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements");
        for (int i=0;i<a.length;i++)
         {
            a[i] = sc.nextInt();
         }
        System.out.println("The elements is");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("ascending element is");
        for(int i=0;i<a.length;i++) 
        {
            for(int j = i+1;j<a.length;j++)
           {
                if(a[i] > a[j]) 
                {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int temp[] = new int[a.length];
        int j = 0;
        for (int i=0; i<a.length-1; i++) 
        {
            if (a[i] != a[i + 1])
            {
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length-1];
        System.out.println("After removing duplicates:");
        for (int i=0;i<=j;i++) 
        {
            System.out.print(temp[i] + " ");
        }
    }
}
