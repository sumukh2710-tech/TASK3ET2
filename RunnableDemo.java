class StudentThread implements Runnable {

    public void run() {

        String[] students = {"Rahul", "Priya", "Sumukh", "Anjali", "Rohit"};

        for (String student : students) {
            System.out.println(student);
        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new StudentThread());

        t1.start();
    }
}