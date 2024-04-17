abstract class Classroom{
	abstract void printInfo();
}
class  StuInfo extends Classroom {
	void printInfo() {
		int enrollNo = 339;
		String name = "Tirth";
		int age = 18;
		String exp = "Development";
		
		System.out.println("Enrollment number: "+enrollNo);
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student expertise: "+exp);
	}
}
class abstractC{
	public static void main(String args[]) {
		Classroom s1 = new StuInfo();
		s1.printInfo();
	}
}