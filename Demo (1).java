
import java.io.*;

class Student
{
	int Roll_no;
	String Class;
	Student(int rno,String c)
	{
	   Roll_no=rno;
	   Class=c;
	   
	}
}
class exam extends Student
{
	String subject;
	int marks;
	exam(int rno,String c,String s,int m)
	{
	   super(rno,c);
	   subject=s;
	   marks=m;
	}
	void display()
	{
	   System.out.println("Roll_no:"+Roll_no);
	   System.out.println("class:"+Class);
	   System.out.println("subject:"+subject);
	   System.out.println("Marks:"+marks);
	}
}
class Demo
{
	public static void main(String args[])
	{
	    exam e1=new exam(101,"JAVA","SYIT",100);
	    e1.display();
	}
}