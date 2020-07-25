class oddeven
{
      public static void main(String args[])
      {
         int n[]={20,15,81,22,56};
         int e=0,o=0;
         int s=n.length;
  
         for(int i=0;i<s;i++)
         {
             if(n[i]%2==0)
             {
                 e++;
             }
             else
             {
                 o++;
             }
          }
          System.out.println("Even:"+e);
          System.out.println("Odd:"+o);
      }
}