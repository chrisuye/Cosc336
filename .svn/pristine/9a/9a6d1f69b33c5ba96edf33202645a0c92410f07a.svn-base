/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items;

/**
 *
 * @author HA TRAN
 */
public class FillItemDecorator extends ItemDecorate{
    AboutItem aboutItem;
    public FillItemDecorator (Item item, AboutItem aboutItem) {
        super(item);
        this.aboutItem = aboutItem;
        
    }
    public String getItemDescription(){
        return item.getItemDescription()+"\n" + aboutItem;
    }
    
}
