package objectAdventure.rooms.roomImpl; //thurle1: added package information 
import objectAdventure.rooms.NormalRoom; //thurle1: added import to fix error.


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SheedyWonder
 */
public class Room3 extends NormalRoom {

    @Override
    public String getRoomAuthor(){
        return "Rasheed Saka";
    }
    
    public Room3(int roomId) {
        super(roomId);

        super.setDescription( "This is the 3st room.");
    }
} //thurle1: Added bracket to fix error
