/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

import java.util.List;
import objectAdventure.items.Item;
import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.Lavender;

/**
 *
 * @author kwood23
 */
public class Room23 extends NormalRoom {

    private String description ="You enter a room with light purple walls. There are plotted flowers near a window and a cat on top of the windowsill.";
    protected Integer roomID;
    protected List<Item> itemList;

    public String getRoomAuthor() {
        return "Kirsten Wood";
    }

    //@param roomID
    public Room23(int roomID) {
        // The room ID must be set.
        super(roomID);
        super.setDescription(description);

        super.itemList.add(new Lavender());
    }

}
