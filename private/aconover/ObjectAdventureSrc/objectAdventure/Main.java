package objectAdventure;

import java.util.Scanner;
import java.util.stream.Collectors;
import objectAdventure.structure.Direction;
import objectAdventure.structure.GameController;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * NOTE: The main Entry point to the program... More responsibility will be delegated to the rooms
 * and a separate command processor in a future iteration.
 *
 * @author Adam J. Conover, COSC436
 */
public class Main {

    /**
     * Hackish main method for testing... for now.
     *
     * @param args
     */
    public static void main(String[] args) {
        var input = new Scanner(in);
        var controller = new GameController("Developer");

        displayGameState(controller);
        userInputLoop(controller, input);
    }

    /**
     * The main user input loop. This will eventually be refactored into a more universal "Command
     * processor". But for now, we are only dealing with movement, so the input is only compass
     * directions.
     *
     * @param controller The game controller used for the input loop.
     * @param input The Scanner source for the input.
     */
    private static void userInputLoop(GameController controller, Scanner input) {
        String inputLine;
        int currentRoomId = Integer.MIN_VALUE;
        
        do {
            String exitDirections
                    = controller
                            .getExitDirections().stream()
                            .map(Direction::getAbbreviation)
                            .map(String::valueOf).collect(Collectors.joining(", "));

            out.printf("[%02d] Enter %s, or Q: ", controller.getMoveNumber(), exitDirections);
            inputLine = input.nextLine().trim().toUpperCase();

            // Break out of the loop if the user is a quitter.
            if (inputLine.equals("Q")) {
                break;
            }

            Direction.fromLexeme(inputLine).ifPresentOrElse(
                    d -> controller.movePlayer(d),
                    () -> out.println("Not a valid direction"));

            displayGameState(controller);

        } while (!inputLine.equals("Q"));
    }

    /** Display the current info for the room and player. * */
    static void displayGameState(GameController controller) {
        out.println("DEBUG: " + controller.getRoomInfo());
        out.println("DEBUG: " + controller.getPlayerInfo());
        out.println();
    }
}
