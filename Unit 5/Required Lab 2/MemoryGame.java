/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */
import java.util.Scanner;

/**
 * MemoryGame simulates a console-based game of memory in which the player reveals two cards at a time with the
 * goal of matching them. Gameplay continues until the player matches all cards.
 * @author kabaram
 * @version 1.0
 */

public class MemoryGame {

    private MemoryCard[][] cards = new MemoryCard[2][4]; //feel free to change these dimensions and card setup

    /**
     * Instantiates all cards. After all cards are instantiated they are shuffled, and then shown.
     */
    public MemoryGame(){
        for (int r = 0; r < cards.length; r++)
        {
            for (int c = 0; c < cards[0].length; c++)
            {
                cards[r][c] = new MemoryCard();
            }
        }
        shuffle();
        showCards();
    }

    /**
     * Sets each card's id instance variable
     */
    public void setCardIDs(){
        for (int r = 0; r < cards.length; r++)
        {
            for (int c = 0; c < cards[0].length; c++)
            {
                cards[r][c].setID();
            }
        }
    }


    /**
     * Shuffles all cards. After shuffling, calls the setCardIDs method above.
     */
    public void shuffle(){
        int rand1 = (int)(Math.random() * cards.length);
        int rand2 = (int)(Math.random() * cards[0].length);
        for (int r = 0; r < cards.length; r++)
        {
            for (int c = 0; c < cards[0].length; c++)
            {
                MemoryCard temp = cards[rand1][rand2];
                cards[rand1][rand2] = cards[r][c];
                cards[r][c] = temp;

                cards[r][c].setID();
            }
        }
    }

    /**
     * Prints the top or bottom outline of each card of row
     * @param row the row of cards to be printed
     */
    public void printTopOrBottom(MemoryCard[] row){
        for (MemoryCard card : row){
            card.printTopOrBottom();
        }
    }

    /**
     * Prints a "blank" middle edge outline for each card of row
     * @param row the row of cards to be printed
     */
    public void printMiddleBlank(MemoryCard[] row){
        for (MemoryCard card : row){
            card.printMiddleBlank();
        }
    }

    /**
     * Prints the center row outline for each card of row
     * @param row the row of cards to be printed
     */
    public void printCenter(MemoryCard[] row){
        for (MemoryCard card : row){
            card.printCenter();
        }
    }

    /**
     * Prints the center row outline and id for each card of row
     * @param row the row of cards to be printed
     */
    public void printIDs(MemoryCard[] row){
        for (MemoryCard card : row){
            card.printID();
        }
    }

    /**
     *
     * @return true if all cards are paired, false otherwise
     */
    public boolean won(){
        /**
         * Write this method
         */
        return false; //temporary
    }


    /**
     * Displays all cards
     */
    public void showCards(){
        for (MemoryCard[] row : cards){
            printTopOrBottom(row);
            System.out.println();
            printMiddleBlank(row);
            System.out.println();
            printCenter(row);
            System.out.println();
            printMiddleBlank(row);
            System.out.println();
            printTopOrBottom(row);
            System.out.println();
            printIDs(row);
            System.out.println("\n\n");
        }
    }

    /**
     * Locates the card with the matching id. If the card is neither paired or revealed, flip the card
     * and then return it
     * @param id The ID number of the card to search
     * @return The card with the matching ID if it is not already paired or revealed, null otherwise
     */
    public MemoryCard revealCard(int id){
        
        for (int r = 0; r < cards.length; r++)
        {
            for (int c = 0; c < cards[0].length; c++)
            {
                if (cards[r][c].getID() == id && !cards[r][c].paired() && !cards[r][c].revealed())
                {
                    cards[r][c].flip();
                    return cards[r][c];
                }
            }
        }
        return null;
    }

    /**
     * Controls the computer-user interface to play the game
     * @param args not used
     */
    public static void main(String[] args){
        MemoryGame game = new MemoryGame();
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n Welcome to Memory!");

        while (!game.won()){ //keep flipping cards until all cards are paired

            System.out.println("Enter first card number to reveal");
            int id = input.nextInt();
            MemoryCard first = game.revealCard(id);

            while (first == null){  //error check for an available card
                System.out.println("Choose a non-revealed card");
                id = input.nextInt();
                first = game.revealCard(id);
            }
            game.showCards();

            System.out.println("Enter second card number to reveal");
            id = input.nextInt();
            MemoryCard second = game.revealCard(id);

            while (second == null){ //error check for an available card
                System.out.println("Choose a non-revealed card");
                id = input.nextInt();
                second = game.revealCard(id);
            }
            game.showCards();

            if (first.equals(second)){  //check for a match
                System.out.println("Congratulations, you paired two cards!");
            }
            else{
                System.out.println("Sorry, no pair made");
            }
            System.out.println("Enter any key to continue.");
            input.next();

            //flip both chosen cards face down
            first.flip();
            second.flip();

            game.showCards();
        }
        System.out.println("Congratulations, you win!");


    }
}
