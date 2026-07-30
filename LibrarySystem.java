import java.util.HashSet;
import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<String> books = new HashSet<>();

        int choice;

        do {

            System.out.println("\n===== Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Count Books");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    String book = sc.nextLine();

                    if (books.add(book))
                        System.out.println("Book Added.");
                    else
                        System.out.println("Duplicate Book! Not Added.");

                    break;

                case 2:
                    System.out.println("\nUnique Books:");

                    for (String b : books) {
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.println("Total Books: " + books.size());
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
