class SharedData {

    private int number;

    public synchronized void produce(int value) {

        number = value;
        System.out.println("Produced : " + number);
    }

    public synchronized void consume() {

        System.out.println("Consumed : " + number);
    }
}

class Producer extends Thread {

    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            data.produce(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer extends Thread {

    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            data.consume();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        SharedData data = new SharedData();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
