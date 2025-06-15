import java.util.Scanner;
class admission
{
	public static void main(String[] a)
	{
	double n1,n2,n3,total;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter number in maths >=65 ::");
	n1=s1.nextDouble();
	System.out.println("Enter number in physics >=55 ::");
	n2=s1.nextDouble();
	System.out.println("Enter number in chemistry >=50 ::");
	n3=s1.nextDouble();
	total=n1+n2+n3;
	total2=n2+n3;
	System.out.println("total in three subject::"+total);
	System.out.println("total in physics and chemistry subject::"+total2);
	if(total>=180||total2>=140)
	{
	System.out.println("candidate is eligible in admission");
	}
	else
	{
	System.out.println("candidate is not eligible in admission");
	}
	}
}

	
