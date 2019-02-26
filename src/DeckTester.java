/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks = new String[]{"Jack","Seven","Three","King","King"};
        int[] values = new int[]{10,7,3,10,10};
        String[] suits = new String[]{"Spades","Diamonds","Hearts","Clubs"};

        Deck deck = new Deck(ranks,suits,values);
        System.out.println(deck);
        for(int i = 0; i < suits.length*values.length; i++){
            deck.deal();
            System.out.println(deck);

        }

    }
}

