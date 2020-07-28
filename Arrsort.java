//Write a program of bubble sorting in ascending order.

class Arrsort
{
	public static void main(String args[])
	{
		int nums[]={2,33,16,55,24};
		System.out.println("Given list is: ");
		for(int i=0;i<nums.length;i++)
		System.out.print(" "+nums[i]);

		for(int pass=1;pass<nums.length;pass++)
		{
			for(int i=0;i<=nums.length-pass;i++)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]<nums[j])
					{
						int temp=nums[i];
						nums[i]=nums[j];
						nums[j]=temp;
					}
				}
			}
		}
		System.out.println("\n"+"sorted list is: ");
		for(int i=0;i<nums.length;i++)
		System.out.println(" "+nums[i]);
	}
}
