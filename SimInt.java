class SimInt
{
        float p;
  	int r,t;
	double SI;
        void input(float prin,int rate,int time)
   	{
	p=prin;
	r=rate;
	t=time;
}
void calculate()
{
 SI=p*r*t/100; 
}
void display()
{
System.out.println("Simple Interest="+SI);
}
public static void main(String[] a)
{
int p1,r1,t1;
Scanner s1=new Scanner(System.in);
SimInt x1=new SimInt();
Sytem.out.println("Enter Value::");
p1=nextFloat(5000f);
r1=nextInt(5);
t1=nextInt(2);
x1.input();
x1.calculate();
x1.display();
}
}