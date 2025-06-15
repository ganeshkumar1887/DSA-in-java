import java.util.Scanner;
class coordinate
{
public staic void main(String[] a)
	{
	int x,y;
	Scanner s1=new Scanner(System .in);
	System.out.print("Enter x value");
	x=s1.nextInt();
	System.out.print("Enter y value");
	y=s1.nextInt();
	if(x>0 && y>0)
	{
	System.out.print("x and y in first quadrant::");
	}
	else if(x<0 && y>0)
	{
	System.out.print("x and y in second quadrant::");
	}
	else if(x<0 && y<0)
	{
	System.out.print("x and y in third quadrant::");
	}
	else if(x>0 && y<0)
	{
	System.out.print("x and y in first quadrant::");
	}
	else if(x=0 && y=0)
	{
	System.out.print("x and y in first quadrant::");
	}
	}
}