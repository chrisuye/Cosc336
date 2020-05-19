package objectAdventure.rooms.roomImpl;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author dbrim. Dorian Brim
 */
public class Room10 extends NormalRoom {

    @Override
    public String getRoomAuthor(){
        return "Dorian Brim";
    }

    /**
     *
     * @param roomId
     */
    public Room10(int roomId) {
        super(roomId);

        super.setDescription( "This is the 10th room. \n" +
                "You find yourself in a beautiful grove. Filled with tall gleaming trees and large growing mushrooms " +
                "In in front of you lies a pedestal that holds a large egg like structure");
    }
}
