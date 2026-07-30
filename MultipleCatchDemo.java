public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

            int number = Integer.parseInt("Java");

            String str = null;
            System.out.println(str.length());

            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);

        }

        catch (ArithmeticException e) {

            System.out.println("ArithmeticException Caught");

        }

        catch (NumberFormatException e) {

            System.out.println("NumberFormatException Caught");

        }

        catch (NullPointerException e) {

            System.out.println("NullPointerException Caught");

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException Caught");

        }

        catch (Exception e) {

            System.out.println("General Exception Caught");

        }

    }
}
