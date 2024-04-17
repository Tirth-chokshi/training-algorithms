import java.io.*;
class Q3
{
  public static void main(String args[])
  {
	  File f=new File("C:\\Users\\iu2282820339\\Desktop\\TIrth 339\\unit2\\f.txt");
	  try
	  {
		  if(f.createNewFile()){
			  System.out.print("file successfully");
		  }
		  else{
			   System.out.print("file already exist");
		  }
	  }
		  catch(IOException w)
		  {
			  System.out.print("Exception handle");
		  }
  }
}
	