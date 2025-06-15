import java.util.*;
public class SumofArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array::");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Elements::");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        System.out.println("total sum of array = "+sum);   
    }
}
