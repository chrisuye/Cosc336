/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;
/**
 *
 * @author kvalle7
 */
public class Room19 extends NormalRoom {
    
    @Override
    
    public String getRoomAuthor() {
        return "Kevin Valle";
    }
    /**
     * 
     * @param roomId
     */
    
    public Room19() {
        super(19);
        super.setDescription("Welcome to room 19.");
    }
}
