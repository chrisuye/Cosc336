package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.GameInstructions;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public class SecretTestingRoom extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "Adam J. Conover";
    }

    /**
     *
     * @param roomId
     */
    public SecretTestingRoom() {
        super(99);
        
        super.setDescription("This is just a roomm for testing. Nothing to see Here.");
        
        super.itemList.add(new GameInstructions());
    }
    
    

}
