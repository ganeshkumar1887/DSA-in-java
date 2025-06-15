import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] sortedArray = new int[n];
        
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++)
        {
            sortedArray[i] = scanner.nextInt();
        }
        
        int length = removeDuplicates(sortedArray);
        
        System.out.println("Array without duplicates:");
        for (int i = 0; i < length; i++)
        {
            System.out.print(sortedArray[i] + " ");
        }
        
        scanner.close();
    }

    public static int removeDuplicates(int[] nums)
     {
        if (nums.length == 0) return 0;

        int index = 1; // Start from the second element
        for (int i = 1; i < nums.length; i++)
         {
            if (nums[i] != nums[i - 1])
            {
                nums[index] = nums[i];
                index++;
            }
        }
        return index; // Return the length of the array without duplicates
    }
}
