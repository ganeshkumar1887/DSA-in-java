import java.util.Scanner;
class p1
{
    public static void main(String[] args)          
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of pattern::");
      int size = sc.nextInt();
      
      for(int i=0;i<size;i++)
      {
        for(int j=0;j<size;j++)
        {                               // * * * * * 
            System.out.print(" * ");  //* * * * *
        }                               //* * * * *
        System.out.println(" ");      //* * * * *
      } 
      
    }
}