abstract class Shapes {  abstract double area();  }
class Circle extends Shapes {
    double radius;
	double pi = 3.14;
	Circle (double radius) { this.radius = radius; }
	double area() {return pi*radius*radius;}
}
class Triangle extends Shapes {
	double base;
	double height;
	Triangle (double base, double height) {
		this.base = base;
		this.height = height;
	}
	double area () { return 0.5*base*height; }
}
class Rectangle extends Shapes {
	double length;
	double width;
	Rectangle (double l ,double w) {
		this. length = l;
		this.width = w;
	}
	double area () { return length*width; }
}
class Calc {
    public static void main(String[] args) {
        Shapes circle = new Circle(4);
        Shapes triangle = new Triangle(5,6);
		Shapes rectangle = new Rectangle(6,7);
		
		System.out.println("Area of circle: "+ circle.area());
		System.out.println("Area of triangle: "+ triangle.area());
		System.out.println("Area of rectangle: "+ rectangle.area());
    }
}
