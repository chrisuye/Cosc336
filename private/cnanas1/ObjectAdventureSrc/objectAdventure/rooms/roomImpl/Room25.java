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

        super.setDescription("This is the 25sst room.");
        
        //AJC: Commented out due to missing YellowHeart class.
        //super.itemList.add(new YellowHeart());
    }

}
