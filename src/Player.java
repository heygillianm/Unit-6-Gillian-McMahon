import java.util.ArrayList;

public class Player {
    private Deck deck;
    private ArrayList list;

    public Player(Deck deck){
        this.deck = deck;
    }

    public String showHand(){
        return list.toString();
    }

    public void draw(){
        list = new ArrayList();
        for (int i = 0; i < 5; i++){
            list.add(deck.getDeck().get(0));
            deck.getDeck().remove(0);
        }
    }
}
