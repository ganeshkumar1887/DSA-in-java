import java.util.Scanner;
public class insert
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Elements::");
        int n = sc.nextInt();
        int arr[] = new int[10];
        System.out.println("Enter the Elements::");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter insert elements::");
        int insert = sc.nextInt();
        System.out.println("Enter the position::");
        int position = sc.nextInt();
        if(position<1||position>n)
        {
            System.out.println("Invalid position::");
        }
        else
        {
            for(int i=n;i>=position;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[position]=insert;

        }
        System.out.println("after insertion ::");
        for(int i=0;i<n4;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
