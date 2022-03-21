import java.util.ArrayList;
import java.util.Collections;


public class Shoe {
    private ArrayList<Card> shoe = new ArrayList<>();


    public Shoe(int numDecks) {
        for (int i = 0; i < numDecks; i++) {
            addDeck(new Deck());
        }
    }

    private void addDeck(Deck deck) {
        for (int i = 0; i < deck.size(); i++) {
            shoe.add(deck.dealCard());
        }
    }

    public void shuffle() {
        Collections.shuffle(shoe);
    }

    /**
     * Returns the last card in the shoe.
     *
     * @return the last card in the shoe
     */

    public Card dealCard() {
        Card card = shoe.get(remainingCards() - 1);    // last card in the shoe
        shoe.remove(card);
        return card;
    }


    public int remainingCards() {
        return shoe.size();
    }
}