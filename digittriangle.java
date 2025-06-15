import java.util.Scanner;

public class digittriangle 
{
     public static void main(String[] args)          
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of pattern::");
      int size = sc.nextInt();
      
      for(int i=0;i<size;i++)
      {
        for(int j=0;j<=i;j++)
        {                               // 1 
            System.out.print(" "+j);    // 1 2
        }                               // 1 2 3 
        System.out.println(" ");      // 1 2 3 4
      } 
      
    }
}
