import java.util.Scanner;
public class barfi 
{
    static void uppertriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void lowertriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*n -(2*i+1);j++)
            {
            
                System.out.print("*");
            }
            for (int j=0; j<i; j++)
            {
            System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of pattern");
       int size = sc.nextInt();
       uppertriangle(size);
       lowertriangle(size);

    }
}
