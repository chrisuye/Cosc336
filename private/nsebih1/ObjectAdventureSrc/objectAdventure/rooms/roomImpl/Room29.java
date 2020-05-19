/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

/**
 *
 * @author nebiyusebihat
 */
import objectAdventure.creatures.Creatures;
import objectAdventure.creatures.creatureImpl.GOAT;
import objectAdventure.items.AboutItem;
import objectAdventure.items.FillItemDecorator;
import objectAdventure.items.Item;
import objectAdventure.items.itemImpl.*;
import objectAdventure.rooms.NormalRoom;

public class Room29 extends NormalRoom{
     
    @Override
    public String getRoomAuthor() {
        return "Nebiyu Sebihat";
    }
 

    /**
     *
     * @param roomId
     */
    public Room29(int roomId) {
        super(roomId);

        super.setDescription( "This is the 29th room.");
        super.itemList.add((Item) new FillItemDecorator(new Axe(), AboutItem.EnchantedItem));
        super.itemList.add((Item) new FillItemDecorator(new TarotCard(), AboutItem.CursedItem));
        super.itemList.add(new WineBottle());
        super.creatureList.add((Creatures) new GOAT());

    }
    
}
