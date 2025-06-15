import java.util.Scanner;
class CheckDays
{
public static void main(String[] a)
	{
	Scanner s1=new Scanner(System .in);
	System.out.println("press 1:: MONDAY");
	System.out.println("press 2:: TUESDAY");
	System.out.println("press 3:: WEDNESDAY");
	System.out.println("press 4:: THURSDAY");
	System.out.println("press 5:: FRIDAY");
	System.out.println("press 6:: SATURDAY");
	System.out.println("press 7:: SUNDAY");
	int days=s1.nextInt();
	switch(days)
	{
	case 1:
	System.out.println("::Monday::");
	break;
	case 2:
	System.out.println("::Tuesday::");
	break;
	case 3:
	System.out.println("::Wednesday::");
	break;
	case 4:
	System.out.println("::Thursday::");
	break;
	case 5:
	System.out.println("::Friday::");	
	break;
	case 6:
	System.out.println("::Saturday::");
	break;
	case 7:
	System.out.println("::Sunday::");
	break;
	default:
	System.out.println("::Invalid number of days ::");
	}
}
}