class arithematic
{
	int a,b;
	void getdata(int x,int y)
	{
   	   a=x;
	   b=y;
	}

	void add()
	{
	  int s=a+b;
	  System.out.println("Addition:"+s);
	}

	void sub()
	{
	  int p=a-b;
	  System.out.println("subtraction is:"+p);
	}

	void mul()
	{
	  int m=a*b;
	  System.out.println("multiplication is:"+m);
	}
	
	void div()
	{
	  int d=a/b;
	  System.out.println("division is:"+d);
	}

}
class calculator 
{
	public static void main(String args[])
	{
	      arithematic a1=new arithematic();
              a1.getdata(10,5);
              a1.add();
              a1.sub();
              a1.mul();
              a1.div();
	}
}


	