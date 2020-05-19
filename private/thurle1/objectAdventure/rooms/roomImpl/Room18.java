package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.*; //thurle1: Added import statement to fix error.
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
        super(18);

        super.setDescription("This room 18 of the game.");
        super.itemList.add(new Radio());
    }



}
