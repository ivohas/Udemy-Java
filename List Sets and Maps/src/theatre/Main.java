package theatre;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== Theatre Seat Booking =====");
        Theatre theatre = new Theatre(3, 5); // Rows A–C, 5 seats each

        theatre.bookSeat('A', 1);
        theatre.bookSeat('A', 2);
        theatre.cancelSeat('A', 2);
        theatre.bookSeat('A', 2);

        theatre.showAvailableSeats();
        theatre.showClosestAvailable('A', 3);
    }
}

