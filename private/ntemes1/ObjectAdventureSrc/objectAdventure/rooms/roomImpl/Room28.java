/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;
/**
 *
 * @author barnol7
 */
public class Room28 extends NormalRoom{
    @Override
    public String getRoomAuthor() {
        return "Brady Arnold";
    }

    /**
     *
     * @param roomId
     */
    public Room28(int roomId) {
        super(roomId);

        super.setDescription( "This is the 28th room.");
    }
}


