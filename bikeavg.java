import java.util.Scanner;
class bikeavg
{
	public static void main(String[] a)
	{
	double dist,lt,avg;
	int t;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Distance in KM::");
	dist=s1.nextDouble();
	System.out.println("Enter petrol in litre::");
	lt=s1.nextDouble();
	avg=(dist/lt);
	System.out.println("total average from bike::"+avg);
	}
}

	
