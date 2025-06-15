import java.util.Scanner;
public class rotate_arr_k 
{
    public static void rotate(int num[],int k)
    {
        k = k % num.length;
        reverse(num,0,num.length-1);
        reverse(num,0,k-1);
        reverse(num,k,num.length-1);
    }
    private static void reverse(int num[],int start,int end) 
    {
        while(start<end)
        {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }   
    }
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of arr::");
      int n = sc.nextInt();

      int arr[] =new int[n];
      System.out.println("Enter the number::");
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      } 
      System.out.println("Enter the times rotate array::");
      int k=sc.nextInt();
      rotate(arr,k);
      System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    } 
}
