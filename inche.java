import java.util.Scanner;
class inche
{
	public static void main(String[] a)
	{
	double cm,inches;
	
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter measure in cm::");
	cm=s1.nextDouble();
	inches=cm/2.54f;
	System.out.println("inche::"+inches);
	}
}

	
	