import java.util.Scanner;
class Time
{
	public static void main(String[] a)
	{
	int sec,hrs,min,second;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter time in second::");
	sec=s1.nextInt();
	hrs=(sec/3600);
	min=(sec-(3600*hrs))/60;
	second=(sec-(3600*hrs)-(min*60));
	System.out.println("hours::"+hrs);
	System.out.println("minutes::"+min);
	System.out.println("second::"+second);
	}
}
	