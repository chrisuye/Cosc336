package objectAdventure.rooms.roomImpl;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import objectAdventure.creatures.creatureImpl.*;
import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.*;

/**
 *
 * @author mwu7
 */
public class Room17 extends NormalRoom {
    @Override
    public String getRoomAuthor() {
        return "Melvin Wu";
    }

    /**
     *
     * @param roomId
     */
    public Room17(int roomId) {
        super(roomId);

        super.setDescription( "This is the 17th room. "
                + "This seems to be a place where weapons are stored. "
                + "There are weapons, armor, and a greatshield here. "
                + "The blacksmith seems to keep these items in quality condition "
                + "and is willing to aid you, as long as you are not hostile"
                + " and purchase their wares.");
        super.itemList.add(new EnchantedGreatshield());
        super.itemList.add(new CursedAxe());
        super.creatureList.add(new Blacksmith());
        
    }
    
}
