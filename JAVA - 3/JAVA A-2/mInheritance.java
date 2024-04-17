interface A {
	default void display () {
		System.out.println("This is class 'A' ");
	}
}
interface B {
	default void display () {
		System.out.println("This is class 'B' ");
	}
}
class mInheritance implements A,B {
	public void display() {
		A.super.display();
		B.super.display();
	}
	public static void main (String args[]) {
		mInheritance test = new mInheritance();
		test.display();
	}
}