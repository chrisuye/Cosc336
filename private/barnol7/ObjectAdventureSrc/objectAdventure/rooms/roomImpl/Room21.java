package objectAdventure.rooms.roomImpl;

import objectAdventure.creatures.Creature;
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

        super.setDescription("This is the 21st room and enchanted.");
        super.itemList.add(new CellPhone());
        super.addCreature(DwightSchrute());
    }

    private Creature DwightSchrute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
