import java.util.Scanner;
class school
{
public static void main(String[] a)
	{
	int rollno,phy,chem,comp;
	String name[20];
	Scanner s1=new Scanner(System .in);

	System.out.print("Enter roll no::");
	rollno=s1.nextInt();

	System.out.print("Enter name::");
	name=s1.nextLine();

	System.out.print("Enter physics marks::");
	phy=s1.nextInt();

	System.out.print("Enter chemistyr::");
	chem=s1.nextInt();

	System.out.print("Enter computer::");
	comp=s1.nextInt();

	System.out.println("roll no::"+rollno);
	System.out.println("name of student::"+name);
	System.out.println("physics marks::"+phy);
	System.out.println("chemistry marks ::"+chem);
	System.out.println("computer marks::"+comp);
}
}