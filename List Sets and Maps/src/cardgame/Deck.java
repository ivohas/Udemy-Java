package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void rotate(int positions) {
        Collections.rotate(cards, positions);
    }

    public void reverse() {
        Collections.reverse(cards);
    }

    public List<Card> dealHand(int numberOfCards) {
        List<Card> hand = new ArrayList<>(cards.subList(0, numberOfCards));
        cards.subList(0, numberOfCards).clear();
        return hand;
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getMinCard() {
        return Collections.min(cards);
    }

    public Card getMaxCard() {
        return Collections.max(cards);
    }

    public int getFrequency(Card card) {
        return Collections.frequency(cards, card);
    }

    public void sortDeck() {
        Collections.sort(cards);
    }
}
