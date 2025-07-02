package cardgame;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PokerGame {

    public void play() {
        Deck deck = new Deck();
        System.out.println("Initial deck created.");
        deck.shuffle();
        System.out.println("Deck shuffled.");

        List<Card> hand = deck.dealHand(5);
        System.out.println("Dealt hand:");
        printHand(hand);

        Collections.sort(hand);
        System.out.println("\nHand sorted by rank:");
        printHand(hand);

        // Custom sort: By Suit then Rank
        hand.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getRank));
        System.out.println("\nHand sorted by suit then rank:");
        printHand(hand);

        System.out.println("\nReversing deck...");
        deck.reverse();

        System.out.println("Rotating deck by 3...");
        deck.rotate(3);

        System.out.println("\nMinimum card in deck: " + deck.getMinCard());
        System.out.println("Maximum card in deck: " + deck.getMaxCard());

        Card example = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
        System.out.println("Frequency of ACE of HEARTS in deck: " + deck.getFrequency(example));

        // Demonstrate binarySearch (deck must be sorted)
        deck.sortDeck();
        int index = Collections.binarySearch(deck.getCards(), example);
        if (index >= 0) {
            System.out.println("Found " + example + " at index " + index + " in sorted deck.");
        } else {
            System.out.println(example + " not found in deck.");
        }
    }

    private void printHand(List<Card> hand) {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
