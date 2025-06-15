import java.util.Scanner;
class equal
{
	public static void main(String[] a)
	{
	double num1,num2;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter first number::");
	num1=s1.nextDouble();
	System.out.println("Enter second Number::");
	num2=s1.nextDouble();
	if(num1==num2)
	{
	System.out.println("::Number are equal::");
	}
	else
	{
	System.out.println("::number are not equal::");
	}
	}
}

