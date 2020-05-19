/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author ieuric1
 */
public class Room05 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Ian Eurice";
    }
    
    public Room05(int roomId) {
        super(roomId);

        super.setDescription( "This is the 5th room.");
    }  
}
