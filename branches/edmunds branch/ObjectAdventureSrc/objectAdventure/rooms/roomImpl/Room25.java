package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;

/**
 *
 * 
 */
public class Room25 extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "Nhat Nguyen";
    }

    /**
     *
     * @param roomId
     */
    public Room25(int roomId) {
        super(roomId);

        super.setDescription( "This is the 25st room.");
    }

}
