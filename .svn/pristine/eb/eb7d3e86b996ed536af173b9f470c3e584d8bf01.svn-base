package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Bow;
import objectAdventure.rooms.NormalRoom;
import objectAdventure.creatures.*;
import objectAdventure.creatures.creatureImpl.Goomba;
import objectAdventure.items.itemImpl.Tridant;
import objectAdventure.items.itemImpl.Bat;
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
       
       super.setDescription("This is the 12th room. There is what seems to be an enchated bow on the table, a cursed Tridant next to the door, and a enchanted but cursed Bat next to the window. The room is also dimly lit from only the moonlight that pours in from the window on the East wall");
       
       super.itemList.add(new Bow());
       super.itemList.add(new Tridant());
       super.itemList.add(new Bat());
       super.creatureList.add(new Goomba());
   }
}
