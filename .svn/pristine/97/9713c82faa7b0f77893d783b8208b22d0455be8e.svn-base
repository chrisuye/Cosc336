/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.creatures.creatureImpl;

import objectAdventure.creatures.Creature;
import objectAdventure.items.Item;
import objectAdventure.patternInterfaces.Observer;


/**
 *
 * @author CJ
 */
public class Shoggoth implements Creature{
    
    
    public String getCreaturesDescription(){
        return "A strange, shifting creature made of black sludge. "
                + "Occasionally bubbles of pale green light or temporary eyes rise to the surface of the undulating mass. "
                + "This is a Shoggoth, a creature of infinite malignity from the stars. "
                + "It seems too preoccupied with reading a dark leatherbound tome to notice your presence. "
                + "Best to keep it that way.";
    }
    
    @Override
    public void update(Object value){
        final String message = "The Shoggoth focuses every fleeting eye towards your location, following your every move.\n";
        System.out.printf(message);
    }
}
