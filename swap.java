import java.util.Scanner;
class swap
{
	public static void main(String[] a)
	{
	int n1,n2,temp;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of two number::");
	n1=s1.nextInt();
	n2=s1.nextInt();
	temp=n1;
	n1=n2;
	n2=temp;
	System.out.println("After swaping");
	System.out.println(+n1);
	System.out.println(+n2);

	}
}
	
	
	
