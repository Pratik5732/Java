import java.util.Scanner;
public class missingelement
{
    public static void main(String[]args)
    {
        int arr[]=new int [6];
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements "+ " ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the given array is " + " ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
        System.out.println("the ascending array is " + " ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
        System.out.print("missing elements is ");
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=arr[i]+1;j<arr[i+1];j++)
            {
             System.out.print(" "+j);
            }
        }
    }
}
