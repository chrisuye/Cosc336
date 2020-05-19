package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.CellPhone;

public class Room21 extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "Gina Alvino";
    }

    /**
     *
   
     */
    public Room21() {
        // The room ID must be set.
        super(21);

        super.setDescription("This is the 21st room.");
        super.itemList.add(new CellPhone());
    }

}
