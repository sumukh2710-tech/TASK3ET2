public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

        sb.append(" Programming");
        System.out.println("After Append: " + sb);

        sb.insert(5, "Language ");
        System.out.println("After Insert: " + sb);

        sb.delete(5, 14);
        System.out.println("After Delete: " + sb);

        sb.replace(5, 16, "Developer");
        System.out.println("After Replace: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}