class field
{
	int sum(int a,int b,int c)
	{
	   return(a+b+c);
	}
	
	int sum(int x,int y)
	{
	  return(x+y);
	}
	
	float sum(float p,float q)
	{
	   return(p+q);
	}

	public static void main(String args[])
	{
	  int m,n;
	  float f;
	  field a1=new field();
	  m=a1.sum(3,4,5);
	  n=a1.sum(3,4);
	  f=a1.sum(1.5f,2.4f);
	  System.out.println("m:"+m);
	  System.out.println("n:"+n);
	  System.out.println("f:"+f);
       }
}