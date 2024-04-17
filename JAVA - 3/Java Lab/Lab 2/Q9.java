package String;
import java.util.StringTokenizer;
public class Q9 {
    public static void main(String[] args) {

        StringTokenizer s = new StringTokenizer("I am your father son.");
        while (s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }
}