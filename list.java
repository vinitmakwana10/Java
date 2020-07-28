import java.io.*;
public class list
{
	public static void main(String args[])throws IOException
	{
		int n;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many Nodes:");
		n=Integer.parseInt(in.readLine());
		System.out.println("Enter start node:");
		int st=Integer.parseInt(in.readLine());
		Node Start=new Node(st);
		Node list=Start;
		for(int i=1;i<n;i++)
		{
			System.out.println("Enter node data:");
			int val=Integer.parseInt(in.readLine());
			list=list.next=new Node(val);
		}
		for(list=Start;list!=null;list=list.next)
		{
			System.out.println(list.data+" ->");
		}
		System.out.println("Null");
	}
}
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}