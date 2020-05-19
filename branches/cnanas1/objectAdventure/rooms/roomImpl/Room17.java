package objectAdventure.rooms.roomImpl;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

        super.setDescription( "This is the 17th room.");
        super.itemList.add(new Greatshield());
        
    }
    
}
