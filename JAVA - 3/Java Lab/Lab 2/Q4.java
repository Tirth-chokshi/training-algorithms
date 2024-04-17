import java.io.*;
class Q3

{
  public static void main(String args[])
  {
	  File f=new File("C:\\Users\\iu2282820339\\Desktop\\TIrth 339\\unit2\\f.txt");
	  
	  try
	  {
		  FileWriter fWriter = new FileWriter("C:\\Users\\iu2282820339\\Desktop\\TIrth 339\\unit2\\f.txt");
		  fWriter.write("Hello World");
		  System.out.print("Data written !");
	  }
		  catch(IOException w)
		  {
			  System.out.print("Exception error");
		  }
  }
}
	