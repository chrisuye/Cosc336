/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

import objectAdventure.items.itemImpl.*;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author Tim Hurley
 */
public class Room16 extends NormalRoom {

    @Override 
    public String getRoomAuthor(){
        return "Tim Hurley";
    }
    
    public Room16(){
        super(16);
        
        super.setDescription("A very empty room containing a single axe on " + 
                "the floor.");
        super.itemList.add(new Axe());
    }
}
