import java.util.Scanner;


class sol{
	public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = in.nextInt();
		System.out.print("Enter width: ");
		int width = in.nextInt();
	
        System.out.println("Area : "+rect.Area(length,width));
		System.out.println("Perimeter : "+rect.Perimeter(length,width));
	
    }
}
class rect{
	public static int Area(int l,int w){
			return l+w;
        }
        
    public static int Perimeter(int l,int w){
        	return (l+w)*2;
        }
}