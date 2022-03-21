import java.util.ArrayList;


public class Hand {
    public ArrayList<Card> hand = new ArrayList<>();   


    public void addCard(Card newCard) {
        hand.add(newCard);
    }


    public int value() {
        int value = 0; 
        for (Card card : hand) {
            value += card.value();
        }
        return value;
    }


    public int size() {
        return hand.size();
    }


    public Card getCard(int index) {
        return hand.get(index);
    }


    public void clear() {
        hand.clear();
    }
}