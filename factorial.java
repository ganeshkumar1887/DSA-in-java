import java.util.Scanner;
public class factorial
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number::");
      int n = sc.nextInt();
      double fact =1;
      for(int i=1;i<=n;i++)
      {
        fact = fact*i;
      }  
      System.out.println("factorial = "+fact);
    }
}