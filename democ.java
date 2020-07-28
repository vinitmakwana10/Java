class democ
{
	public static void main(String args[])
	{
	   StringBuffer str=new StringBuffer("12ABC53");
           System.out.println("String:"+str);
	   int l=str.length();
	   int count=0;
	   for(int i=0;i<l;i++)
	   {
	      char temp;
	      temp=str.charAt(i);
	      if(temp=='0'||temp=='1'||temp=='2'||temp=='3'||temp=='4'||temp=='5'||temp=='6'||
                 temp=='7'||temp=='8'||temp=='9')
	      {
		    count++;
	       }
           }
	            System.out.println("Total numeric character:"+count);
           }
}