import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int choice;

        do {

            System.out.println("\n===== Priority Queue =====");
            System.out.println("1. Insert Priority");
            System.out.println("2. Display Execution Order");
            System.out.println("3. Remove Highest Priority");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Priority Number: ");
                    pq.offer(sc.nextInt());
                    System.out.println("Priority Added.");
                    break;

                case 2:
                    System.out.println("Current Queue:");
                    System.out.println(pq);
                    break;

                case 3:
                    if (pq.isEmpty())
                        System.out.println("No Tasks Available.");
                    else
                        System.out.println("Executed Priority: " + pq.poll());
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
