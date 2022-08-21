import java.util.*;

public class CardGame {
    private List<Card> cardDeck = new ArrayList<>();
    public CardGame() {
        final char[] SUITS = {'\u2764', '\u2663', '\u2666', '\u2660'};
        final String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
        int counter = 0;

        for (int i = 0; counter < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardDeck.add(new Card(Character.toString(SUITS[i]), VALUES[j], j+2));
            }
            counter++;
        }
    }
    public void getDeck() {
        for (Card card : this.cardDeck) {
            System.out.println(card.toString());
        }
    }

    public Card dealCard() {
        return this.cardDeck.get(0);
    }

    public List<Card> sortDeckInNumberOrder() {
        Collections.sort(this.cardDeck, (a, b) -> a.getValue()-b.getValue());

        return this.cardDeck;
    }

    public List<Card> sortDeckIntoSuits() {

        Collections.sort(this.cardDeck, (a, b) -> a.getSuit().compareTo(b.getSuit()));

        return this.cardDeck;
    }

    public List<Card> shuffleDeck() {
        Collections.shuffle(this.cardDeck);

        return this.cardDeck;
    }

}