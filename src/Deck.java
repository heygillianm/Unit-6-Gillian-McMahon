import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<Card>();
        for (String rank : Card.RANK){
            for (String suit : Card.SUIT){
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle(){
        for (int i = 0; i < deck.size(); i++){
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck.get(i);
            deck.set(i, deck.get(rand));
            deck.set(rand, temp);
        }
    }

    public ArrayList getDeck(){
        return deck;
    }

    public String toString(){
        return deck.toString();
    }
}
