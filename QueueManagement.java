import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<String> queue = new LinkedList<>();

        int choice;

        do {

            System.out.println("\n===== Ticket Queue =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Next Customer");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer Name: ");
                    queue.offer(sc.nextLine());
                    System.out.println("Customer Added.");
                    break;

                case 2:
                    if (queue.isEmpty())
                        System.out.println("Queue Empty.");
                    else
                        System.out.println("Serving: " + queue.poll());
                    break;

                case 3:
                    if (queue.isEmpty())
                        System.out.println("Queue Empty.");
                    else
                        System.out.println("Next Customer: " + queue.peek());
                    break;

                case 4:
                    System.out.println("Remaining Queue:");
                    System.out.println(queue);
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}