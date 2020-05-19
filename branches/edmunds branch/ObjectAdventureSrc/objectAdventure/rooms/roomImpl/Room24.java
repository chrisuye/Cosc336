/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author htran11
 */
public class Room24 extends NormalRoom {
     @Override
    public String getRoomAuthor() {
        return "Ha Tran";
    }

    /**
     *
     * @param roomId
     */
    public Room24(int roomId) {
        super(roomId);

        super.setDescription( "This is the 24th room.");
    }
    
}
