import java.util.Scanner;
class AddAvg
{
public static void main(String[] a)
	{
	int i,sum=0;
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter a number for add::");
	int num=s1.nextInt();
	for(i=1;i<=num;i++)
	{
	 sum=sum+i;
	
	}
	float aveg=sum/100;
	System.out.println("total sum is="+sum);
	System.out.print("total avg is="+aveg);

        }
}
