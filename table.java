import java.util.Scanner;
class table
{
public static void main(String[] a)
	{
	int i;
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter a number which write a table::");
	int num=s1.nextInt();
	for(i=1;i<=10;i++)
	{
	  int tab=num*i;
	System.out.println(" "+num+" * "+i+" = " +tab);
	}
}
}
