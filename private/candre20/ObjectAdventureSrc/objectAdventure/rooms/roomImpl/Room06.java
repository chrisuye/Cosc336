package objectAdventure.rooms.roomImpl;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import objectAdventure.items.DecoratedType;
import objectAdventure.items.itemImpl.Telescope;
import objectAdventure.items.itemImpl.HandSanitizer;
import objectAdventure.items.itemImpl.Flashlight;
import objectAdventure.items.DecorateItem;
import objectAdventure.creatures.creatureImpl.Shoggoth;
import objectAdventure.rooms.NormalRoom;

/**
 *
 * @author candre20
 */
public class Room06 extends NormalRoom {
    
    @Override
    public String getRoomAuthor(){
        return "Christian Andrews";
    }
    
    /**
     *
     * @param roomId
     */
    
    public Room06(int roomId) {
        super(roomId);
        String s = "This is the 6th room.\n"
                +"You find yourself in a small library. "
                +"Shelves cover the north, south, and east walls, while the western wall is home to a large telescope pointing through a barred window."
                +"A large orrery takes up the middle of the room, slowly spinning to match the precession of the planets."
                +"A small collapsible telescope sits at the base of the orrery.";

        super.setDescription(s);
        super.itemList.add(new Telescope());
        super.itemList.add(new DecorateItem(new HandSanitizer(), DecoratedType.EnchantedItem));
        super.itemList.add(new DecorateItem(new Flashlight(), DecoratedType.CursedItem));
        super.creatureList.add(new Shoggoth());
    }
    public Room06() {
        this(6);
    }
}
