package objectAdventure.structure;

import objectAdventure.rooms.Configuration_RoomList;
import static java.lang.System.out;
import java.text.MessageFormat;
import static java.util.stream.Collectors.joining;
import objectAdventure.creatures.Player;
import objectAdventure.rooms.NoSuchRoomException;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public class GameController {

    private final GameMap map;
    private final Configuration_RoomList rooms;
    private final Player player;
    private int moveNumber;

    /**
     *
     * @param playerName
     */
    public GameController(String playerName) {
        this.map = GameMap.getMap();
        this.rooms = new Configuration_RoomList();
        this.player = new Player(playerName);
        this.player.setCurrentRoom(0);
        this.moveNumber = 1;
    }

    /**
     *
     * @param roomId
     *
     * @return the description of the room
     */
    public String getRoomDecription(Integer roomId) {
        try {
            var theRoom = rooms.getRoom(roomId);
            var roomDescription = new StringBuilder();

            roomDescription
                    .append("Room ID: ").append(theRoom.getRoomId())
                    .append("\nRoom Author: ").append(theRoom.getRoomAuthor())
                    .append("\nDescription:\n\t")
                    .append(theRoom.getDescription()).append('\n');
                    
            if (!theRoom.getItems().isEmpty()) {
                roomDescription.append("Items:\n");

                theRoom.getItems().forEach(theItem -> {
                    roomDescription.append(MessageFormat.format("\t{0}\n", theItem.getItemDescription()));
                });
            }

            roomDescription.append("You can see the exits to the: ");

            var directionList = map.getExitConnections(roomId)
                    .keySet()
                    .stream().map(x -> x.toString())
                    .collect(joining(", "));

            roomDescription.append(directionList);

            return roomDescription.toString();
        } catch (NoSuchRoomException ex) {
            return ex.getMessage();
        }
    }

    /**
     *
     * @return
     */
    public String getRoomDecription() {
        return getRoomDecription(getPlayer().getCurrentRoom());
    }

    /**
     *
     * @param dir
     */
    public void movePlayer(Direction dir) {
        Integer currentRoom = getPlayer().getCurrentRoom();
        var exits = this.map.getExitConnections(currentRoom);

        if (!exits.containsKey(dir)) {
            out.printf("Ouch... you ran right into a wall! (There is no exit to the %s.)\n", dir.toString());
        } else {
            final var newRoomId = exits.get(dir);
            if (map.doesExist(newRoomId)) {
                getPlayer().setCurrentRoom(newRoomId);
            } else {
                out.printf(
                        "Sorry, A route to this room does not yet exist. "
                        + "The Game Map may need to be updated\n");
            }
        }
        moveNumber++;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     *
     * @return
     */
    public int getMoveNumber() {
        return moveNumber;
    }

    /**
     *
     * @param moveNumber
     */
    public void setMoveNumber(int moveNumber) {
        this.moveNumber = moveNumber;
    }

    /**
     *
     * @param roomId
     */
    public void DEBUG_JumpToRoom(Integer roomId) {
        getPlayer().setCurrentRoom(roomId);
    }

}
