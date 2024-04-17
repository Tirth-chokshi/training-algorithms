class Circlefinder{
	double radius;
	Circlefinder (double r) {
		this.radius = r;
	}
	double calculateArea() {
		double pi = 3.14;
		return pi*radius*radius;
	}
	public static void main(String args[]) {
		Circlefinder circle = new Circlefinder(4);
		System.out.println("Radius: "+circle.radius+" Area of circle is: "+circle.calculateArea());
	}
}