/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items;

/**
 *
 * @author me
 */
public class FillItemDecorator extends ItemDecorate{
    AboutItem aboutitem;
    
    public FillItemDecorator(Item item, AboutItem aboutItem) {
        super(item);
        this.aboutitem =aboutItem;
    }
    
    public String getItemDescription(){
        return item.getItemDescription()+ "\n" +aboutitem;
    }
    
    
}
