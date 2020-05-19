/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author rob_a
 */
public class Room01 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Robert Alcorn";
    }
    
    public Room01(int roomId) {
        super(roomId);

        super.setDescription( "This is the 1st room.");
    }  
}
