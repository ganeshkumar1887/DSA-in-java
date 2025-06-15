import java.util.Scanner;
class quad_equ
{
	public static void main(String[] ar)
	{
	double a,b,c,root;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter value of a,b,c::");
	a=s1.nextFloat();
	b=s1.nextFloat();
	c=s1.nextFloat();
        root=b*b-4.0*a*c;
	if(root>0.0)
	{
	double root1=(-b+Math.sqrt(root))/(2.0*a);
	double root2=(-b-Math.sqrt(root))/(2.0*a);
	System.out.println("Root1::"+root1);
	System.out.println("Root2::"+root2);
	}
	else if(root==0.0)
	{
	root=-b/(2.0*a);
	System.out.println("root="+root);
	}
	else {
            System.out.println("Roots are not real.");
	}
}
	