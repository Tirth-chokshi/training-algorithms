import java.util.Scanner;

class Maximum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        
       if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1+" is maximum.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print(num2+" is maximum");
        } else {
            System.out.print(num3+" is maximum");
        }
        }
    }