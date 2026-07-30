public class GenericMethodDemo {

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50};

        String[] names = {"Rahul", "Anjali", "Kiran", "Rohit"};

        Character[] letters = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Integer Array:");
        printArray(numbers);

        System.out.println("\nString Array:");
        printArray(names);

        System.out.println("\nCharacter Array:");
        printArray(letters);
    }
}
