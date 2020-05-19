/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

/**
 *
 * @author chris
 */

import objectAdventure.items.itemImpl.*;
import objectAdventure.rooms.NormalRoom;
public class DoNotEnter  extends NormalRoom{
    
    @Override
    public String getRoomAuthor() {
        return "Christian Seyoum";
    }
 

    /**
     *
     * @param roomId
     */
    public DoNotEnter() {
        super(30);

        super.setDescription( "Why did you enter?");
        super.itemList.add(new Blackbook());
    }
}
