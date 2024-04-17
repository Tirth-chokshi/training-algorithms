package String;
import java.util.Scanner;
public class Q10 {
    public static void st(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String a = sc.next();
        System.out.println("Length of String: "+a.length());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            st();
        }
    }
}	