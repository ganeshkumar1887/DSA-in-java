import java.util.Scanner;
class Temp
{
	public static void main(String[] a)
	{
	double celcius,fahren;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Temperature in celcius::");
	celcius=s1.nextFloat();
	fahren=(1.8*celcius)+32;
	System.out.println("Temperature::"+fahren);
	}
}
	
	
	
