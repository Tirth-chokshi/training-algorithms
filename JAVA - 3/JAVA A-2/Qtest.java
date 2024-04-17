interface P1{
	int a=101;
	void displayP1();
}
interface P2{
	int b = 201;
	void displayP2();
}
interface P12 extends P1,P2{
	int c  = 301;
	void displayP12();
}
class Q implements P12 {
	public void displayP1() {
		System.out.println("A: "+a);
	}
	public void displayP2() {
		System.out.println("B: "+b);
	}
	public void displayP12() {
		System.out.println("C: "+c);
	}
}
public class Qtest {
	public static void main(String args[]) {
		Q q = new Q();
		q.displayP1();
		q.displayP2();
		q.displayP12();
	}
}