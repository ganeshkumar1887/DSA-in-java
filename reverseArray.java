import java.util.*;
public class reverseArray
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
           int start = 0;
           int end = size - 1;
            while(start<end)
            {
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;

            }
            for (int value : arr)
             { 
                System.out.print(value + " ");
             }
        }
}
