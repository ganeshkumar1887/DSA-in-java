import java.util.Scanner;
public class deletefffsst
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
        
        System.out.println("Enter delete position::");
        int position = sc.nextInt();
        if(position<1||position>n)
        {
            System.out.println("Invalid position::");
        }
        else
        {
            for(int i=position-1;i<=n;i++)
            {
                arr[i]=arr[i+1];
            }
           

        }
        System.out.println("after insertion ::");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
