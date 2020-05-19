/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.creatures.creatureImpl;

import objectAdventure.creatures.Creature;

/**
 *
 * @author melvi
 */
public class Blacksmith implements Creature{
     @Override
    public String getCreaturesDescription(){
        return "An entity that oddly wears a menacing suit of armor "
                + "that seems to be crafted from the sclaes of dragons.";
    }
}
