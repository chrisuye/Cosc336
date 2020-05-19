package objectAdventure.rooms.roomImpl;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author jweagl1
 */
public class Room09 extends NormalRoom {

    @Override
    public String getRoomAuthor(){
        return "Justin Weagly";
    }

    /**
     *
     * @param roomId
     */
    public Room09(int roomId) {
        super(roomId);

        super.setDescription( "This is the 9th room. \nYou find yourself in a great underground garden, with magnificent carved entrances at the North and South ends. \nAt one spot in the east wall, a small stream of water flows from a crevice in the stone brickworks. \nThe garden is full of trees, flowers, grass, and numerous statues covered in moss and vines, all with terrified expressions on their faces. \nAt the north end, one statue is leaning over, reaching for a miner's pack on the ground.");
    }
}


/* Note from Adam J. Conover:  
   Thats a pretty nice description... you obviously get where all of this is going!!!

   Though for longer descriptions, you may want to break them up like this.

        String s = 
                "this is "
                + "some text"
                + "Spanning multiple lines.";

*/
