import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck tarotDeck = new Deck();
        Scanner input = new Scanner(System.in);
        int nextCard = 1;
        System.out.println("Welcome, let me read your cards...");
        do {
            tarotDeck.draw();
            System.out.println("Hmm, interesting....");
            System.out.println("Draw another card? (1 for yes, 2 for no)");
            //technically anything other than 1 is a no but......
            nextCard = input.nextInt();
            //Should validate that it's an int, but that's a job for later.  For now we /trust/.
        } while (nextCard == 1);
        input.close();
        System.out.println("Until next time...");
    }

}
