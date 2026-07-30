import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDirectory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> employees = new HashMap<>();

        int choice;

        do {

            System.out.println("\n===== Employee Directory =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display Employees");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    employees.put(id, name);
                    System.out.println("Employee Added.");
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();

                    if (employees.containsKey(id))
                        System.out.println("Employee Name: " + employees.get(id));
                    else
                        System.out.println("Employee Not Found.");
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    if (employees.containsKey(id)) {

                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();
                        employees.put(id, name);

                        System.out.println("Employee Updated.");
                    } else {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();

                    if (employees.remove(id) != null)
                        System.out.println("Employee Deleted.");
                    else
                        System.out.println("Employee Not Found.");
                    break;

                case 5:
                    System.out.println("\nEmployee Records:");

                    for (Map.Entry<Integer, String> e : employees.entrySet()) {
                        System.out.println("ID: " + e.getKey() + " Name: " + e.getValue());
                    }
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