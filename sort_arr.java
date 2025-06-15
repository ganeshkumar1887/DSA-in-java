import java.util.Scanner;
import java.util.Arrays;
public class sort_arr 
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array::");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements::");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array::");
        for(int num : arr)
        {
            System.out.println(num +" ");
        }
    }
}
