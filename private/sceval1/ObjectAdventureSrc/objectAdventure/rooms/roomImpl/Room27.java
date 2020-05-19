/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;
/**
 *
 * @author jalves1
 */
public class Room27 extends NormalRoom{
    @Override
    public String getRoomAuthor() {
        return "Jaque's room!";
    }

    /**
     *
     * @param roomId
     */
    public Room27(int roomId) {
        super(roomId);

        super.setDescription( "This is the 27th room.");
    }
}







