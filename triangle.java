import java.util.Scanner;
class triangle
{
	public static void main(String[] a)
	{
	double a1,a2,a3,sum;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter 1st angle::");
	a1=s1.nextDouble();
	System.out.println("Enter 2nd angle::");
	a2=s1.nextDouble();
	System.out.println("Enter 3rd angle::");
	a3=s1.nextDouble();
	sum=a1+a2+a3;
	System.out.println("total sum of triangle is ="+sum);
	if(sum==180)
	{
	System.out.println("triangle is formed");
	}
	else
	System.out.println("triangle is not formed");
	}
}
