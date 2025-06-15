import java.util.Scanner;
class CountAdd
{
public static void main(String[] a)
	{
	int i,sum=0;
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter a number for add::");
	int num=s1.nextInt();
	for(i=1;i<=num;i++)
	{
	  sum=sum+i;
	}
	System.out.print("total sum is="+sum);
        }
}
