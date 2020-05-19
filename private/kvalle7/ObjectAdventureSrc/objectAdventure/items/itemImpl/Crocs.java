/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;
/**
 *
 * @author SheedyWonder
 */
public class Crocs implements Item //thurle1: Added implements Item to fix this item
{
    @Override
    public String getItemDescription() {
        return "A nice pair of crocs";
    }
}
