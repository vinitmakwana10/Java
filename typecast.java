class typecast
{
     public static void main(String args[])
     {
	 System.out.println("variables created");
         char c='x';
	 System.out.println("c="+c);
	 byte b=50;
	 System.out.println("b="+b);
	 short s=1996;
	 System.out.println("s="+s);
	 int i=123456789;
	 System.out.println("i="+i);
	 long l=123456754321L;
	 System.out.println("l="+l);
	 float f1=3.14F;
	 System.out.println("f1="+f1);
	 double d2=0.0000987;
	 System.out.println("d2="+d2);



	 System.out.println("Type Converted");
         short s1=(short)b;
	 short s2=(short)i;
	 float n1=(float)l;
	 int m1=(int)f1;
	 System.out.println("(short)b="+s1);
	 System.out.println("(short)i="+s2);
	 System.out.println("(float)l="+n1);
	 System.out.println("(int)f1="+m1);
     }
}
