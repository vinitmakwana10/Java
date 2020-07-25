import java.io.*;
class copyCharacters
{
	public static void main(String args[])
	{
	   File inFile=new File("input.dat");
	   File outFile=new File("output.dat");
	   FileReader ins=null;
	   FileWriter outs=null;
	   try
	   {
		ins=new FileReader(inFile);
		outs=new FileWriter(outFile);
		int ch;
		while( (ch=ins.read( ) )!= -1)
		{
			outs.write(ch);
		}
	   }
	   catch(IOException e)
	   {
		System.out.println(e);
	 	System.exit(-1);
	   }
	   finally
	   {
	       try
	       {
 			ins.close();
			outs.close();
		}
	  catch(IOException e){ }
       }
    }
}