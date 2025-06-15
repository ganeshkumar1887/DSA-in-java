import java.util.Scanner;
class Trianglecheck
{
public static void main(String[] a)
	{
	int sidea,sideb,sidec;
	Scanner s1=new Scanner(System .in);
	System.out.println("Enter side value::");
	sidea=s1.nextInt();
	sideb=s1.nextInt();
	sidec=s1.nextInt();
	 if ((sidea + sideb > sidec) && (sidea + sidec > sideb) && (sideb + sidec > sidea)) 
	 {
              if(sidea==sideb && sideb==sidec) // Check if all sides are equal.
              {
              System.out.println("This is an equilateral triangle"); 
              }
	      else if(sidea==sideb || sidea==sidec || sideb==sidec)   
	      {
              System.out.println("This is an isosceles triangle");  
	      }
	      else 
              {
                System.out.println("This is a scalene triangle");  
       	      }
	} 
	else
	{
          System.out.println("Input sides do not form a valid triangle.\n");
        }
    }
} 
