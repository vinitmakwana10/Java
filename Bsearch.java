//Write a proram to illustrate binary search.

class Bsearch
{
	public static void main(String args[])
	{
		int arr[]={11,22,33,44,55};
		System.out.println("{");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+",");
		System.out.println("}");

		int found=lsearch(arr,33);
		if(found== -1)
		  System.out.println("Number not found...");
		else 
                  	  System.out.println("Number found at position "+found);
	}
	public static int lsearch(int arr[],int sk)
	{
		int top=0;
		int bottom=arr.length;
		while(top<bottom)
		{
			int mid=(top+bottom)/2;
			if(arr[mid]==sk)
				return mid;
			else if(arr[mid]<sk)
				top=mid+1;
			else
				bottom=mid-1;
		}
		return -1;
	}
}