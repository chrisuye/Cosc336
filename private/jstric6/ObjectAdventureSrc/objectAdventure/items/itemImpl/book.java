/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;

/**
 *
 * @author Nebeyu Temesgen
 */
public class book implements Item{

    @Override
    public String getItemDescription() { //thurle1: Fixed method name error
        return "A book";
    }

}
