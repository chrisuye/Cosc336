package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Mainframe;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author Casey McCoy, COSC436
 */
public class ServerRoom extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "Casey McCoy";
    }

    public ServerRoom() {
        super(31);

        super.setDescription("Server room");
        super.itemList.add(new Mainframe());

    }

}
