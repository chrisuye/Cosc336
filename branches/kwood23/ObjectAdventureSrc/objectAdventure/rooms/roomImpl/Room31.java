package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author Casey McCoy, COSC436
 */
public class Room31 extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "Casey McCoy";
    }

    /**
     *
     * @param roomId
     */
    public Room31(int roomId) {
        super(roomId);

        super.setDescription( "This is the 31st room.");
    }

}
