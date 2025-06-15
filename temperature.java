import java.util.Scanner;
class temperature
{
	public static void main(String[] a)
	{
	double t;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter temperature in celcius::");
	t=s1.nextDouble();
	if(t<0)
	{
	System.out.println("then freezing wheather:");
	}
	else if(t<10)
	{ 
	System.out.println("then Cold weather:");
	}
	else if(t<=20)
	{ 
	System.out.println("Cold wheather:");
	}
	else if(t<=30)
	{ 
	System.out.println("normal temperature:");
	}
	else if(t<=40)
	{ 
	System.out.println("its very hot day:");
	}
	else 
	System.out.println("then Its Very HotTest Data :");
	

}
}

