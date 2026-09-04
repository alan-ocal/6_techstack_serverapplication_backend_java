import java.util.HashSet;

/**
 * This class implements a technical support system.
 * It is the top level class in this project.
 * The support system communicates via text input/output
 * in the text terminal.
 *
 * This class uses an object of class InputReader to read input
 * from the user, and an object of class Responder to generate responses.
 *
 *It contains a loop that repeatedly reads input and generates
 * output until the users wants to leave.
*/
public class SupportSystem {

    //instance fields
    private InputReader inputreader;
    private Responder responder;

    /**
     * Creates a technical support system.
     * assign instance fields in the Constructor
     */
    public SupportSystem() {
        inputreader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome message and enter
     * into a dialog with the user, until the user ends the dialog.
     */
    public void start() {
        boolean finished = false;

        printWelcome();

        while (!finished) {
            //reads some user input
            HashSet<String> input = inputreader.getInput();
            //Using HashSet's contains(Object o)
            if (input.contains("bye")) { //if (exit condition)
                finished = true;        //end the loop
            } else {                     //the part that is done repeatedly while I wish to continue
                //ask the responder to generate a response
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome() {
        System.out.println("Welcome to the Home I-VAST ");
        System.out.println();
        System.out.println("Home I-VAST will assist you with any query❤️ regarding ambulance services, hospitals, food banks, general practices, pharmacies in Leeds, West Yorkshire  .");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye() {
        System.out.println("Thank you for using Home I-VAST");
    }
}

