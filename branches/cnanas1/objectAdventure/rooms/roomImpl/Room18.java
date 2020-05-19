package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author Lawrence Chanaud Jr., COSC436
 */
public class Room18 extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "Lawrence Chanaud Jr.";
    }

    public Room18() {
        // The room ID must be set.
        super(18);

        super.setDescription("This room 18 of the game.");
    }



}
