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
import objectAdventure.creatures.creatureImpl.NineTales;
import objectAdventure.items.AboutItem;
import objectAdventure.items.FillItemDecorator;
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
        super(20);

        super.setDescription( "Why did you enter?");
        super.itemList.add(new FillItemDecorator(new Axe(), AboutItem.EnchantedItem));
        super.itemList.add(new FillItemDecorator(new TarotCard(), AboutItem.CursedItem));
        super.itemList.add(new Blackbook());
        super.creatureList.add(new NineTales());
    }
}
