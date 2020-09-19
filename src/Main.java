import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck tarotDeck = new Deck();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, welcome...");
        //ask if the user wants a reading or story prompts
        System.out.println("Enter R for a reading or S for story prompts:");
        String response = input.nextLine();
        switch (response) {
            case "R":
            case "r":
                int nextCard = 1;
                int numCards = 1;
                while (nextCard == 1) {
                    System.out.println("Please think of a question you would like to have answered:");
                    //on repeats it's not waiting for this and idk why......
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
                    input.nextLine();
                    //Should validate that it's an int, but that's a job for later.  For now we /trust/.
                }
                break;
            case "S":
            case "s":
                int next = -1;
                String story = "";
                System.out.println("Here's your starting prompt:");
                
                while (next != 0) {
                    tarotDeck.draw();
                    story += (input.nextLine() + "\n");
                    do {
                        System.out.println("Enter 1 for another prompt or 0 to end.");
                        next = input.nextInt();
                        input.nextLine();
                    } while ((next != 1) && (next != 0));
                    if (next == 0) {
                        System.out.println("Thanks for playing!  Here's your final story:");
                        System.out.println(story);
                    }
                }
                
                break;
            default:
                System.out.println("You're not great at following simple directions, are you?");
        }
        
        
        input.close();
        System.out.println("Until next time...");
    } //end Main

} //end Class
