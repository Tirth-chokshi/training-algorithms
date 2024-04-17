import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scan.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
