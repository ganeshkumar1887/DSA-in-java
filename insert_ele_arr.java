import java.util.Scanner;
public class insert_ele_arr 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array::");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements::");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position where element is insert::");
        int pos = sc.nextInt();
        System.out.println("Enter the elements::");
        int element =sc.nextInt();
        int array[] = new int[size+1];
        for(int i=0,j= 0;i<size+1;i++)
        {
            if(i==pos)
            {
                array[i]=element;
            }
            else
            {
                array[i]=arr[j];
                j++;
            }
        }
        System.out.println("Array after insertion:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}

