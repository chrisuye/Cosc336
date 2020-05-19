/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items;

/**
 *
 * @author chris
 */
public abstract class ItemDecorate implements Item{
    
    protected Item item;
    
    public ItemDecorate(Item item){
        super();
        this.item = item;
    }
}
