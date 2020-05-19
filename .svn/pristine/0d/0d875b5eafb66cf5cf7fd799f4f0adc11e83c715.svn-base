package objectAdventure;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.*;
import java.util.Scanner;
import objectAdventure.structure.Direction;
import objectAdventure.structure.GameController;

/**
 * NOTE: This is just temporary... More responsibility will be delegated to the rooms and a separate
 * command processor in a future iteration.
 *
 * @author Adam J. Conover, COSC436
 */
public class Main {

    /**
     * Hackish main method for testing... for now.
     * @param args
     */
    public static void main(String[] args) {
        var input = new Scanner(in);
        var controller = new GameController("Developer");
        String inputLine;

        displayGameState(controller);

        do {
            out.printf("[%02d] Enter N,S,E,W, or Q: ", controller.getMoveNumber());
            inputLine = input.nextLine().trim().toUpperCase();

            if (inputLine.equals("Q")) {
                break;
            }

            var dir = Direction.fromLexeme(inputLine);

            dir.ifPresentOrElse(
                    d -> controller.movePlayer(d),
                    () -> out.println("Not a valid direction"));

            displayGameState(controller);

        } while (!inputLine.equals("Q"));
    }


    /** Display the current info for the room and player. **/
    static void displayGameState(GameController controller) {
        var notificationText = controller.getRoomDecription();
        var playerInfo = controller.getPlayer().toString();

        out.println(notificationText);
        out.println("Raw Player Info: " + playerInfo);
        out.println();
    }
}
