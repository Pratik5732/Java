import java.util.Scanner;
class deleteelement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int count=0;
        System.out.println("Enter elements:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The elements is");
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        }
        System.out.println("Enter element to delete: ");
        int del = sc.nextInt();
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == del)
            {
                for(int j = i; j < a.length - 1; j++)
                {
                    a[j] = a[j + 1];
                }
                count++;
            }
        }
        if(count==0)
        {
          System.out.println("element not found");
        }
        else
        {
        System.out.println("Array after deletion:");
        for(int i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + " ");
        }
        }  
    }
}
