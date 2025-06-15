import java.util.Scanner;
class MonthDay
{
public static void main(String[]  a)
	{
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter a months number::");
	int num=s1.nextInt();
	switch(num)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	System.out.println("this months is 31 days");
	break;
	
	case 4:
	case 6:
	case 11:
	System.out.println("this months is 30 days");
	break;
	case 2:
	System.out.println("this months is 28/29 days");
	default:
	System.out.println("invalid number");
}
}
}



