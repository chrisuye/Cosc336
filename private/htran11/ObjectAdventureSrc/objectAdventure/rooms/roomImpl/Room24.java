/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms.roomImpl;

import objectAdventure.rooms.NormalRoom;

import objectAdventure.items.*;
import objectAdventure.items.Item;
import objectAdventure.creatures.*;
import objectAdventure.creatures.creatureImpl.YellowHeart;
import objectAdventure.items.itemImpl.Axe;
import objectAdventure.items.itemImpl.TarotCard;




/**
 *
 * @author htran11
 */
public class Room24 extends NormalRoom {
     @Override
    public String getRoomAuthor() {
        return "Ha Tran";
    }

    /**
     *
     * @param roomId
     */
    public Room24(int roomId) {
        super(roomId);
        
        super.setDescription( "This is the 24th room.");
         
        super.itemList.add((Item) new FillItemDecorator (new Axe(), AboutItem.EnchantedItem));
        super.itemList.add((Item) new FillItemDecorator (new TarotCard(), AboutItem.CursedItem));
        super.itemList.add(new Fullhouse());
        super.creatureList.add((Creature) (Creatures) new YellowHeart());
        
        
        
        
        
        
    }

    private static class Fullhouse implements Item {

        public Fullhouse() {
        }

        @Override
        public String getItemDescription() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
