interface Student{
	public void info();
}
class StuInfo implements Student {
	public void info () {
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
public class inter {
	public static void main(String argsp[]) {
		StuInfo s1 = new StuInfo();;
		s1.info();
	}
}