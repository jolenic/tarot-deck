import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck tarotDeck = new Deck();
        Scanner input = new Scanner(System.in);
        int nextCard = 1;
        System.out.println("Welcome, welcome...");
        int numCards = 1;

        while (nextCard == 1) {
            System.out.println("Please think of a question you would like to have answered:");
            input.nextLine();
            System.out.println("How many cards shall I pull for you?");
            numCards = input.nextInt();
            for (int k = 0; k < numCards; k++) {
                tarotDeck.draw();
                System.out.println();
            }
            System.out.println("Hmm, interesting....");
            System.out.println("Another question? (1 for yes, 2 for no)");
            //technically anything other than 1 is a no but......
            nextCard = input.nextInt();
            //Should validate that it's an int, but that's a job for later.  For now we /trust/.
        }
        input.close();
        System.out.println("Until next time...");
    } //end Main

} //end Class
