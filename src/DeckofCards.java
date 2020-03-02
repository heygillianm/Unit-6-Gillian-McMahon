public class DeckofCards {
    public static void main(String [] args){
        Deck deck = new Deck();
        Player player1 = new Player(deck);
        Player player2 = new Player(deck);

        System.out.println("A full deck of cards: " + deck.toString());
        deck.shuffle();

        player1.draw();
        System.out.println("Player 1 Hand: " + player1.showHand());

        player2.draw();
        System.out.println("Player 2 Hand: " + player2.showHand());

        deck.shuffle();
        System.out.println("After dealing the cards and shuffling: " + deck.toString());
    }
}
