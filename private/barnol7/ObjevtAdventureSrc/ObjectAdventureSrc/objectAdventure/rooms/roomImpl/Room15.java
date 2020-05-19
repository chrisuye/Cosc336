/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.Computer;
import objectAdventure.creatures.creatureImpl.Thanos;

/**
 *
 * @author edmundgladzah
 */
public class Room15 extends NormalRoom {
    
    int roomId;
    
    @Override
    public String getRoomAuthor(){
        return "Edmund Gladzah";
    }
    
    public Room15(int roomId){
        super(roomId);
        
        super.setDescription("This is the 15th room.");
        super.itemList.add(new Computer());
        super.creatureList.add(new Thanos());
    }
    
    
}
