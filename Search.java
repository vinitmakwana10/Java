//Write a program to illustrate sequential search.

class Search
{
	public static void main(String args[])
	{
		int arr[]={11,22,33,44,55};
		System.out.printf("{");
		for(int i=0;i<arr.length;i++)
			System.out.printf(arr[i]+",");
		System.out.println("}");

		int found=lsearch(arr,33);
		if(found== -1)
			System.out.println("Numbers Not found...");
		else
			System.out.println("Numbers found at position"+found);
		found=lsearch(arr,66);
		if(found==-1)
			System.out.println("Numbers not found..");
		else
			System.out.println("Numbers found at position"+found);

	}
	public static int lsearch(int arr[],int sk)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==sk)
			{
				return i;	
			}
		}
		return -1;
	}
}


