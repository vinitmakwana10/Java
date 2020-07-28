//Write a program to illustrate if construct using arrays.

class IfTest
{
	public static void main(String args[])
{
int i,total=0,selected=0,others=0;
float[]height={160.5f,174.5f,168.5f,170.5f,155.5f};
float[]weight={56.2f,70.5f,63.0f,49.4f,60.2f};
for(i=0;i<=4;i++)
{
if(height[i]>165.0 && weight[i]<70.0)
{
selected=selected+1;
}
total=total+1;
}
others=total-selected;
System.out.println("\n Total Persons="+total);
System.out.println("\n Number of persons with...");
System.out.println("height>165 and weight<="+selected);
System.out.println("\n Others=" +others);
}
}
