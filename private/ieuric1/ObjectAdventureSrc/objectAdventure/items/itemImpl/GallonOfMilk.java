/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;

/**
 *
 * @author rob_a
 */
public class GallonOfMilk implements Item{
    
    public String getItemAuthor() {
        return "Rob Alcorn";
    }
    
    @Override
    public String getItemDescription() {
        return "Literally just a gallon of milk, nothing remarkable about it";
    }
}
