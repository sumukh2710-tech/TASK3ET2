public class ArrayExceptionDemo {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        try {

            System.out.println("Element: " + numbers[10]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Invalid Array Index.");

        }

        System.out.println("Program Continues...");
    }
}