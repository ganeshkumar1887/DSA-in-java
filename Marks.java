import java.util.Scanner;
class Marks
{
public static void main(String[] a)
	{
	float m1,m2,m3,m4,m5,result,percentage,average;
	Scanner s1=new Scanner(System .in);
	System.out.print("Enter 5 subject marks");
	m1=s1.nextFloat();
	m2=s1.nextFloat();
	m3=s1.nextFloat();
	m4=s1.nextFloat();
	m5=s1.nextFloat();
	result=m1+m2+m3+m4+m5;
	average=result/100;
	percentage=(result*100)/500;
	System.out.println("Total Marks="+result);
	System.out.println("Total perc="+percentage);
	System.out.print("average="+average);
	}
}