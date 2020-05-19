package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.*;
import objectAdventure.rooms.NormalRoom;
/**
 * @author Jason Hamilton
 */
public class Room12 extends NormalRoom {

    /**
     *
     * @return Jason Hamilton
     */
    @Override
    public String getRoomAuthor() {
        return "Jason Hamilton";
    }

   public Room12() {
       super(12);
       
       super.setDescription("This is the 12th room. There is a bow on the table");
       
       super.itemList.add(new Bow());
   }
}
