/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.items.itemImpl.*;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author mike achianga
 */


public class Room13 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Mike Darius Achianga";
    }
    
    public Room13(int roomId) {
        super(roomId);

        super.setDescription( "This is the thirteen room, where you can find my DJ Equipment" );
        super.itemList.add(new DJBOARD());
        
    }  
}
