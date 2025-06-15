import java.util.Scanner;

public class pyramid 
{
     public static void main(String[] args)          
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of pattern::");
      int size = sc.nextInt();
      
      for(int i=0;i<size;i++)
      {
            // for printing space 
           for(int j=0;j<size-i-1;j++)
          {                                
            System.out.print(" ");  
          }  
          // print star in each raw 
           for(int j=0;j< 2*i+1;j++)
          {
            System.out.print("*");
          }
          // printing space of each raw 
          for (int j = 0; j<size-i-1; j++)
          {
            System.out.print(" ");
          }                          
      } 
    System.out.println(" ");
    }
}
