import java.util.Scanner;
class quadratic
{
	public static void main(String[] arg)
	{
	double a,b,c,root;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of a,b,c::");
	a=s1.nextDouble();
	b=s1.nextDouble();
	c=s1.nextDouble();
        root=b*b-4*a*c;
	if(root>=0)
	{
	double root1=(-b+Math.sqrt(root))/(2*a);
	double root2=(-b-Math.sqrt(root))/(2*a);
	System.out.println("Root1::"+root1);
	System.out.println("Root2::"+root2);
	}
	else
	{
	System.out.println("The equation has no real root");
	}
	}
}
	