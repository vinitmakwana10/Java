interface sports
{
	float sportwt=6.0f;
	void putwt();
}
class student
{
	int rollno;
	void getNumber(int n)
	{
	   rollno=n;
	}
	void putNumber()
	{
	   System.out.println("Rollno:"+rollno);
	}
}
public class test extends student
{
	float sem1,sem2;
	void getMarks(float m1,float m2)
	{
	   sem1=m1;
	   sem2=m2;
	}
	void putMarks()
	{
	   System.out.println("Marks obtained:");
	   System.out.println("Sem1 marks:"+sem1);
	   System.out.println("Sem2 marks:"+sem2);
	}
}
public class Result extends test implements sports
{
	float total;
	public void putwt()
	{
	   System.out.println("Sports wt:"+sportwt);
	}
	void display()
	{
	   total=sem1+sem2+sportwt;
	   putNumber();
	   putMarks();
	   putwt();
	   System.out.println("total="+total);
	}
}
public class multiple
{
	public static void main(String args[])
	{
	   Result r1=new Result();
	   r1.getNumber(123);
	   r1.getMarks(37.5f,25.2f);
	   r1.display();
	}
}
