import java.util.Scanner;
class largest
{
	public static void main(String[] a)
	{
	int n1,n2,n3;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter 1st number::");
	n1=s1.nextInt();
	System.out.println("Enter 2nd number::");
	n2=s1.nextInt();
	System.out.println("Enter 3rd number::");
	n3=s1.nextInt();
	if((n1>n2)&&(n1>n3))
	{
	System.out.println(" 1st number is greatest::");
	}
	else if((n2>n1)&&(n2>n3))
	{
	System.out.println("2nd  number is greatest::");
	}
	else
	{
	System.out.println("3rd number is greatest::");
	}
    }
}

	