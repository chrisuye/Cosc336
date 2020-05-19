package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;
import objectAdventure.creatures.Creature;
import objectAdventure.creatures.Creatures;
import objectAdventure.creatures.creatureImpl.NewHouse;
import objectAdventure.items.*;

import objectAdventure.items.itemImpl.*;



/**
 *
 *
 */
public class Room25 extends NormalRoom {

    public Room25() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
        super.itemList.add((Item) new FillItemDecorator(new Axe(), AboutItem.EnchantedItem));
        super.itemList.add((Item) new FillItemDecorator (new TarotCard(), AboutItem.CursedItem));
        super.itemList.add(new YellowHeart());
        super.creatureList.add((Creature) (Creatures) new NewHouse());
        
        
        //AJC: Commented out due to missing YellowHeart class.
        //super.itemList.add(new YellowHeart());
    }

}
