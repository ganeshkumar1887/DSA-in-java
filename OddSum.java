import java.util.Scanner;
class OddSum
{
public static void main(String[] a)
	{
	int i,sum=0;
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter a number::");
	int num=s1.nextInt();
	System.out.println("odd number::");
	for(i=1;i<=num;i=i+2)
	{
	  System.out.println(i);
	  sum=sum+i;
	}
	System.out.println("total sum of odd number::"+sum);

	}
}
