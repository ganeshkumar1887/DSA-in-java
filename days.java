import java.util.Scanner;
class days
{
	public static void main(String[] a)
	{
	int ndays,years,months,days;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter number of days::");
	ndays=s1.nextInt();
	years=ndays/365;
	ndays=ndays-(365*years);
	months=ndays/30;
	days=ndays-(months*30);
	System.out.println("years::"+years);
	System.out.println("Months::"+months);
	System.out.println("days::"+days);
	}
}	