/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Makafui Dzeze
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.items.itemImpl.Laptop;
import objectAdventure.rooms.NormalRoom;


public class Room4 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Makafui Dzeze";
    }
    
    public Room4(int roomId) {
        super(roomId);

        super.setDescription( "This is the fourth room, where you can find my laptop");
        super.itemList.add(new Laptop());
    }  
}


