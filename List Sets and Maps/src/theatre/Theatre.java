package theatre;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Theatre {
    private final Set<Seat> availableSeats = new TreeSet<>();
    private final Set<Seat> bookedSeats = new TreeSet<>();

    public Theatre(int rows, int seatsPerRow) {
        for (char row = 'A'; row < 'A' + rows; row++) {
            for (int num = 1; num <= seatsPerRow; num++) {
                availableSeats.add(new Seat(row, num));
            }
        }
    }

    public boolean bookSeat(char row, int number) {
        Seat seat = new Seat(row, number);
        if (availableSeats.remove(seat)) {
            bookedSeats.add(seat);
            System.out.println("Seat " + seat + " booked.");
            return true;
        } else {
            System.out.println("Seat " + seat + " is not available.");
            return false;
        }
    }

    public boolean cancelSeat(char row, int number) {
        Seat seat = new Seat(row, number);
        if (bookedSeats.remove(seat)) {
            availableSeats.add(seat);
            System.out.println("Seat " + seat + " booking canceled.");
            return true;
        } else {
            System.out.println("Seat " + seat + " was not booked.");
            return false;
        }
    }

    public void showAvailableSeats() {
        System.out.println("Available Seats:");
        availableSeats.forEach(System.out::println);
    }

    public void showClosestAvailable(char row, int number) {
        Seat target = new Seat(row, number);
        Seat higher = ((TreeSet<Seat>) availableSeats).higher(target);
        Seat lower = ((TreeSet<Seat>) availableSeats).lower(target);

        System.out.println("Closest to " + target + ":");
        if (lower != null) System.out.println("Lower: " + lower);
        if (higher != null) System.out.println("Higher: " + higher);
        if (lower == null && higher == null) System.out.println("No nearby available seats.");
    }

    private static class Seat implements Comparable<Seat> {
        private final char row;
        private final int number;

        public Seat(char row, int number) {
            this.row = row;
            this.number = number;
        }

        @Override
        public int compareTo(Seat other) {
            if (this.row != other.row) {
                return this.row - other.row;
            }
            return this.number - other.number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Seat)) return false;
            Seat seat = (Seat) o;
            return row == seat.row && number == seat.number;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, number);
        }

        @Override
        public String toString() {
            return row + String.format("%02d", number);
        }
    }
}
