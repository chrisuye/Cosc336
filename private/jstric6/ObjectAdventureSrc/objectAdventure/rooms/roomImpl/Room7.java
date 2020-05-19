/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.items.itemImpl.Couch;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author cnanas1
 */
public class Room7 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Caitlin Nanashko";
    }
    
    public Room7(int roomId) {
        super(roomId);

        super.setDescription( "This is the seventh room.");
        super.itemList.add(new Couch());
    }  
}
