class Calculator<T> {

    private T data;

    public Calculator(T data) {
        this.data = data;
    }

    public void display() {
        System.out.println("Stored Value: " + data);
    }
}

public class GenericCalculator {

    public static void main(String[] args) {

        Calculator<Integer> obj1 = new Calculator<>(500);

        Calculator<String> obj2 = new Calculator<>("Java");

        Calculator<Double> obj3 = new Calculator<>(45.67);

        System.out.println("Integer Object");
        obj1.display();

        System.out.println();

        System.out.println("String Object");
        obj2.display();

        System.out.println();

        System.out.println("Double Object");
        obj3.display();
    }
}
