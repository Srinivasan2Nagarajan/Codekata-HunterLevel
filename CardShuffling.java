public class Deck {

////////////////////////////////////////
// Data Members
////////////////////////////////////////

private Card[] cards; // array holding all 52 cards
private int cardsInDeck; // the current number of cards in the deck

public static final int DECK_SIZE = 52;

/**
 * Shuffles the deck (i.e. randomly reorders the cards in the deck). 
 */
public void shuffle() {
    int newI;
    Card temp;
    Random randIndex = new Random();

    for (int i = 0; i < cardsInDeck; i++) {

        // pick a random index between 0 and cardsInDeck - 1
        newI = randIndex.nextInt(cardsInDeck);

        // swap cards[i] and cards[newI]
        temp = cards[i];
        cards[i] = cards[newI];
        cards[newI] = temp;
    }
}

}
