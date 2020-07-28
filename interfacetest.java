interface Area
{
	final static float pi=3.14F;
	float compute(float x,float y);
}
class rectangle implements Area
{
	public float compute(float x,float y)
	{
	   return(x*y);
	}
}
class circle implements Area
{
	public float compute(float x,float y)
	{
	   return(pi*x*x);
	}
}
public class interfacetest
{
	public static void main(String args[])
	{
	   rectangle r=new rectangle();
	   circle c=new circle();
	   Area a;
	   a=r;
	   System.out.println("Area of rectangle:"+a.compute(10,20));
	   a=c;
	   System.out.println("Area of circle:"+a.compute(10,0));
	}
	
}
