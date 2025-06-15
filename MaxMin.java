import java.util.Scanner;
public class MaxMin
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of elements::");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements::");
        for(int i =0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("maximun elements::"+max);
        System.out.println("minimun elements::"+min);

    }
}