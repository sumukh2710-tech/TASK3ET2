import java.util.ArrayList;
import java.util.HashMap;

class Booking {

    private ArrayList<String> users = new ArrayList<>();
    private HashMap<Integer, Boolean> seats = new HashMap<>();

    public Booking() {

        for (int i = 1; i <= 5; i++) {
            seats.put(i, false);
        }
    }

    public synchronized void bookTicket(String user, int seat) {

        if (!seats.containsKey(seat)) {

            System.out.println("Invalid Seat Number");
            return;
        }

        if (seats.get(seat)) {

            System.out.println(user + " : Seat " + seat + " Already Booked");

        } else {

            users.add(user);

            seats.put(seat, true);

            StringBuilder sb = new StringBuilder();

            sb.append("\n===== Booking Confirmation =====\n");
            sb.append("User : ").append(user).append("\n");
            sb.append("Seat : ").append(seat).append("\n");
            sb.append("Status : Booked Successfully");

            System.out.println(sb);
        }
    }

    public <T> void display(T value) {

        System.out.println(value);
    }
}

class UserThread extends Thread {

    Booking booking;
    String user;
    int seat;

    UserThread(Booking booking, String user, int seat) {

        this.booking = booking;
        this.user = user;
        this.seat = seat;
    }

    public void run() {

        booking.bookTicket(user, seat);
    }
}

public class OnlineTicketBookingSystem {

    public static void main(String[] args) {

        Booking booking = new Booking();

        UserThread u1 = new UserThread(booking, "Rahul", 2);
        UserThread u2 = new UserThread(booking, "Priya", 2);
        UserThread u3 = new UserThread(booking, "Sumukh", 3);

        u1.start();
        u2.start();
        u3.start();
    }
}