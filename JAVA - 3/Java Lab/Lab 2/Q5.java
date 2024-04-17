import java.io.*; 	
import java.util.Scanner;	
public class Q5 {
    public static void main(String args[]) {

        try {
			FileReader fReader = new FileReader("C:\\Users\\iu2282820339\\Desktop\\TIrth 339\\unit2\\f.txt");
            Scanner sc = new Scanner(fReader);
      

            if(sc.hasNextLine()){
				String d = sc.nextLine();
				System.out.println(d);
			}
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: ");
        }
    }
}
