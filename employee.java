import java.lang.*;
import java.io.*;
class employee
{
	int sal,eid;
	String name;
	employee(int s,int e,String nm)
	{
	   sal=s;
	   eid=e;
	   name=nm;
	}

	void display()
	{
	   System.out.println("Name:" +name);
	   System.out.println("eid:" +eid);
	   System.out.println("salary:" +sal);
	}
	
	public static void main(String args[]) throws IOException
	{
	   int e,s;
           String nm;
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	   System.out.println("Enter Name");
	   nm=br.readLine();
	   System.out.println("Enter eid");
	   e=Integer.parseInt(br.readLine());
	   System.out.println("Enter salary");
	   s=Integer.parseInt(br.readLine());
	   employee e1=new employee(e,s,nm);
	   e1.display();
       }
	   
}