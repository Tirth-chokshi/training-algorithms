class LeapYear {
  int year;
  void checkLeapYear() {
    if (year % 4 == 0)
      System.out.println(year + " is leap year.");
    else
      System.out.println(year + " is not leap year.");
  }
}
public class Year {
  public static void main(String[] args) {
    LeapYear y1= new LeapYear();
    y1.year = 2012;
    y1.checkLeapYear();
    y1.year = 2005;
    y1.checkLeapYear();
  }
}