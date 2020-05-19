/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author SteveJCevallos
 */
public class Room02 extends NormalRoom {

    @Override
  
    public String getRoomAuthor(){
        return "Steve Cevallos";
    }
    
    public Room02(int roomId) {
        super(roomId);

        super.setDescription( "This is the 1st room.");
    }  
}
