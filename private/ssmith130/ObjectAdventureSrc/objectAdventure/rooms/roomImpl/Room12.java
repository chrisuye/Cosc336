package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Bow;
import objectAdventure.rooms.NormalRoom;
/**
 * @author Jason Hamilton
 */
public class Room12 extends NormalRoom {


    @Override
    public String getRoomAuthor() {
        return "Jason Hamilton";
    }

   public Room12(int roomID) {
       super(roomID);
       
       super.setDescription("This is the 12th room. There is a bow on the table. The room is also dimly lit from only the moonlight that pours in from the window on the East wall");
       
       super.itemList.add(new Bow());
   }
}
