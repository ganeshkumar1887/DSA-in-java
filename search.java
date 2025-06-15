import java.util.Scanner;
public class search
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Elements::");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements::");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search elements::");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0;i<size;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("Number"+target+" is found at index"+i+1+"");
                found = true;
                break;
            }
        }
        if(found=false)
        {
            System.out.println("number is not found::");
        }
    }
}