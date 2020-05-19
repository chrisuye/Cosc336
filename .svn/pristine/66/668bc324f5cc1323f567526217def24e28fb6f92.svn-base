package objectAdventure.rooms;

import java.util.List;
import objectAdventure.items.Item;

/**
 * A general Interface to all rooms.
 *
 * @author Adam J. Conover, COSC436
 */
public interface Room {

    /**
     *
     * @return The Author of the room
     */
    public default String getRoomAuthor() {
        return "The author wishes to remain anonymous.";
    }

    /**
     *
     * @return Description of the room
     */
    public default String getDescription() {
        return "This room does not yet have a description.";
    }

    /**
     *
     * @return the Assigned ID of the room.
     */
    public Integer getRoomId();

    /**
     *
     * @return A list of any items found in the room
     */
    public List<Item> getItems();
}
