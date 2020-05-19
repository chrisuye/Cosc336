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
 * @author Artemio
 */
public class Room11 extends NormalRoom {

    int roomId = 11;

    @Override
    public String getRoomAuthor() {
        return "Artemio Fernandez";
    }

    public Room11(int roomId) {
        super(roomId);
        super.setDescription("This is the 11th room. The floor is littered with what appears to be shredded paper. "
                + "On the north wall is a portrait of a family of four. The eyes of the family follow your every move, awaiting for you to make a mistake. "
                + "To the east is a silver metal door, leading to an undiscovered room. To the west is another, this door is red and wooden, slowly eroding. "
                + "The south door is made of glass. You are able to identify the room as a weapons room.");
        super.itemList.add(new FidgetSpinner());
    }

}
