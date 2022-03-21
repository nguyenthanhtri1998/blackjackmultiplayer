import java.util.ArrayList;


public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();  
// Thêm card vào deck
    public Deck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public Card dealCard() {
        Card card = deck.get(size() - 1);    
        return card;
    }

    public int size() {
        return deck.size();
    }
}