import java.util.LinkedList;
import java.util.ListIterator;

public class ItineraryManager {
    public static void main(String[] args) {
        LinkedList<Destination> itinerary = new LinkedList<>();
        itinerary.add(new Destination("Paris", DestinationType.CITY));
        itinerary.add(new Destination("Bali", DestinationType.BEACH));
        itinerary.add(new Destination("Swiss Alps", DestinationType.MOUNTAIN));
        itinerary.add(new Destination("Athens", DestinationType.HISTORIC_SITE));

        // Displaying the full itinerary using an iterator
        System.out.println("Your Travel Itinerary:");
        ListIterator<Destination> iterator = itinerary.listIterator();
        while (iterator.hasNext()) {
            System.out.println(" -> " + iterator.next());
        }

        // Navigate backward
        System.out.println("\nReversing through itinerary:");
        while (iterator.hasPrevious()) {
            System.out.println(" <- " + iterator.previous());
        }
    }
}
