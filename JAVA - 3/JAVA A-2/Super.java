class Shapes{
	String shapeRequirment = "height, width, length";
}
class Circle extends Shapes {
	String shapeRequirment ="radius";
	
	void display1() {
		System.out.println("Basic requirments of shapes: "+super.shapeRequirment);
		}
	void display2() {
		System.out.println("Requirments of circle shape: "+shapeRequirment);
	}
}
class Super{
	public static void main(String args[]) {
		Circle c = new Circle();
		c.display1();
		c.display2();
	}
}