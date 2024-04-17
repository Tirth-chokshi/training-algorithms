import java.util.Scanner;
class rect{
	int length;
	int width;
	
	public int areaS(){
		return x+y;
	}
	pulic void areaP(int x,int y){
		this.length=x;
		this.width=y;
	}
	/*public int perig(){
		return (a+b)*2;
	}
	public void pritp(int a,int b){
		this.length=a;
		this.width=b;
	}
	*/
	
    public static void main(Strig args[]){
       rect a = new rect(3,4);
	   a.areaS();
    }
}


/*Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width :");
        double length = sc.nextInt();
        double width = sc.nextInt();
        
        System.out.print("Area of rectangle: ");
        double area = width * length;
        System.out.print("Perimeter of rectangle: ");
        double perimeter = (length+width)*2;
		*/