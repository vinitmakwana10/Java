class Rectangle
{
	int l,b;
	void getdata(int x,int y)
	{
	   l=x;
	   b=y;
	}
        int area()
	{
	   int a=l*b;
	   return a;
	}
}
public class Rectarea
{
	public static void main(String args[])
	{
	    int area1;
	    Rectangle r1=new Rectangle();
            r1.getdata(5,10);
            area1=r1.area();
            System.out.println("Area of rectangle:" +area1);
        }
}
