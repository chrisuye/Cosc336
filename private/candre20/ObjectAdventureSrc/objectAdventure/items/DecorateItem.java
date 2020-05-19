/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items;

/**
 *
 * @author CJ
 */
public class DecorateItem extends DecorateInterface{
    
    DecoratedType decorate;
    
    public DecorateItem(Item item, DecoratedType type){
        super(item);
        this.decorate = type;
    }
    
    @Override
    public String getItemDescription(){
        if (decorate == DecoratedType.CursedItem){
            return newItem.getItemDescription() + " This item appears to be cursed, dark shadows move across its surface "
                    + "like creatures below the surface of water";
        }
        else if (decorate == DecoratedType.EnchantedItem){
            return newItem.getItemDescription() + " This item appears to be enchanted, bright stars twinkle upon its surface "
                    + " and the item smells faintly of raspberries.";
        }
        else{
            return newItem.getItemDescription();
        }
    }
    
}
