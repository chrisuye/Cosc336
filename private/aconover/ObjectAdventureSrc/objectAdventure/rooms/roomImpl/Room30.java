/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;

/*
 * @author sbilli2
 */
public class Room30 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Shamar Billingslea";
    }
    
    public Room30(int roomId) {
        super(roomId);

        super.setDescription( "This is the 30th room.");
    }  
}
    