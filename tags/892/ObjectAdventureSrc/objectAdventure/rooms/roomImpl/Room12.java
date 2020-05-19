package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.Bow;
import objectAdventure.rooms.NormalRoom;
import objectAdventure.creatures.creatureImpl.Goomba;
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
       
       super.setDescription("This is the 12th room. There is a enchanted bow on the table, a cursed Tridant in the corner against the wall, and a enchanted but cursed bat near the window. The room is also dimly lit from only the moonlight that pours in from the window on the East wall. Within the darkness of the room, you spot what looks to be a mushroom shaped monster. You dub it, the Goomba!");
       
       super.itemList.add(new Bow());
       super.itemList.add(new Tridant());
       super.itemList.add(new Bat());
       super.creatureList.add(new Goomba());
   }
}
