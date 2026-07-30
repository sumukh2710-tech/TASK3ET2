import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Sort Students");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    students.add(sc.nextLine());
                    System.out.println("Student Added.");
                    break;

                case 2:
                    System.out.println("\nStudent List:");
                    for (String s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name to Search: ");
                    String search = sc.nextLine();

                    if (students.contains(search))
                        System.out.println("Student Found.");
                    else
                        System.out.println("Student Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Student Name to Remove: ");
                    String remove = sc.nextLine();

                    if (students.remove(remove))
                        System.out.println("Student Removed.");
                    else
                        System.out.println("Student Not Found.");
                    break;

                case 5:
                    Collections.sort(students);
                    System.out.println("Students Sorted Successfully.");
                    break;

                case 6:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
