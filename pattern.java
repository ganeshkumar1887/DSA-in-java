import java.util.Scanner;
class pattern
{
public static void main(String[] a)
	{
	int i,j;
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter a num line::");
	int num=s1.nextInt();
	for(i=1;i<=num;i++)
	{
	  	for(j=1;j<=i;j++)
		{
		System.out.print(" * ");
		}
		System.out.print("\n");
	}
}
}