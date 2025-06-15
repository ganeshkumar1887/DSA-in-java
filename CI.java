import java.util.Scanner;
class CI
{
	public static void main(String[] a)
	{
	double p,r,n,ComInt,Amount;
	int t;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Principle::");
	p=s1.nextDouble();
	System.out.println("Enter rate::");
	r=s1.nextDouble();
	System.out.println("Enter time::");
	t=s1.nextInt();
        
	Amount=p*Math.pow((1+(r/100)),t);
	ComInt=Amount-p;
	System.out.println("comound Interst::"+ComInt);
	}
}
