/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;


/**
 *
 * @author mwu7
 */
public class EnchantedGreatshield implements Item{
    
     public String getItemAuthor() {
        return "Melvin Wu";
    }
     
     private String id = "Enchanted Greatshield that can protect"
             + " the whole body of player. Blocks damage from all"
             + " directions, even from behind.";

    @Override
    public String getItemDescription() {
        return id;
    }
    
}
