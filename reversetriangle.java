import java.util.Scanner;

public class reversetriangle
{
     public static void main(String[] args)          
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of pattern::");
      int size = sc.nextInt();
      
      for(int i=0;i<size;i++)
      {
        for(int j=size;j>i;j--)
        {                               // * * * * * 
            System.out.print(" * ");  //* * * * 
        }                               //* * * 
        System.out.println(" ");      //* *
      } 
      
    }
}
