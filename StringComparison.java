import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        System.out.println("\nUsing == : " + (str1 == str2));

        System.out.println("Using equals(): " + str1.equals(str2));

        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));

        System.out.println("Using compareTo(): " + str1.compareTo(str2));

        System.out.println("\nExplanation:");
        System.out.println("== compares memory locations.");
        System.out.println("equals() compares actual content.");
        System.out.println("equalsIgnoreCase() ignores uppercase/lowercase.");
        System.out.println("compareTo() returns:");
        System.out.println("0 -> Strings are equal");
        System.out.println("Positive -> First string is greater");
        System.out.println("Negative -> Second string is greater");

        sc.close();
    }
}