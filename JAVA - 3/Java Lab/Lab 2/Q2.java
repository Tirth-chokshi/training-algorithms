class Q2 {
    public static void main(String args[]) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int index = 4;

            int result = numbers[index];

            System.out.println("The value of index " + index + " is: " + result);
        }   
		catch (ArrayIndexOutOfBoundsException e) {
          //  System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            
        }
    }
}
