import java.util.Scanner;
public class countvowels 
{
    public static void main(String x[])
    {
        String s;
        System.out.println("enter the string ");
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            char ss = s.charAt(i);
            if(ss=='a' || ss=='e' || ss=='i' || ss=='o' || ss=='u' || ss=='A' || ss=='E' || ss=='I' || ss=='O' || ss=='U' )
            {
                count++;
            }
        }
        System.out.println("The vowels in string is "+count);
    }
}
