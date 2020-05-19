/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;
import objectAdventure.creatures.creatureImpl.Spiderpig;
import objectAdventure.items.itemImpl.Pencil;
/**
 *
 * @author jstric6
 */
public class Room26 extends NormalRoom{
    
    
    @Override
    public String getRoomAuthor(){
        return "Joseph Strickler";
        
    }
    /**
     *
     * @param roomId
     */
    public Room26(){
        super(26);
        super.setDescription("This is room 26.");
        super.creatureList.add(new Spiderpig ());
        super.itemList.add(new Pencil());
    }
    
}
