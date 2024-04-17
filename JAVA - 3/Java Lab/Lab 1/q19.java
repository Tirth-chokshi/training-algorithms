import java.util.Scanner;
public class Student{

   
   public String name;
   public int number;
   
   public Student (String stuName,int stuNumber) {
      name = stuName;
	  number = stuNumber;
   }
   public void printStu() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + number);
   }

   public static void main(String args[]) {
      Student s1 = new Student("Tirth",339);
      s1.printStu();
   }
}