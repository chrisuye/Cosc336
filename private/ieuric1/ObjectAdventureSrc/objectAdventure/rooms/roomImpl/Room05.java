/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author ieuric1
 */
public class Room05 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Ian Eurice";
    }
    
    public Room05(int roomId) {
        super(roomId);

        super.setDescription( "you find yourself in a well lit room with stone walls "
		+" and wooden pillars. cobwebs are strune throughout and on a table in the middle of the room"
		+" seemily untouched by the decay is a puzzlebox.");
		super.itemList.add(new PuzzleBox());
		super.creaturelist.add(new Mimic());
		
    }  
}
