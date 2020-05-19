package objectAdventure.rooms.roomImpl;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author candre20
 */
public class Room06 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Christian Andrews";
    }
    
    /**
     *
     * @param roomId
     */
    
    public Room06(int roomId) {
        super(roomId);

        super.setDescription( "This is the 6th room.");
    }
    public Room06() {
        this(6);
    }
}
