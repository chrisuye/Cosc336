/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.creatures.creatureImpl;

import objectAdventure.creatures.Creatures;
import objectAdventure.items.Observable;

/**
 *
 * @author chris
 */
public class NineTales implements Creatures {
    private String observerName = "NineTales";

    @Override
    public String getCreaturesDescription() {
        return"NineTales";
    }

    @Override
    public void update(Object value) {
        final String msgTmpl = "Observer %s has been notified that items have been picked up\n";
        System.out.printf(msgTmpl, this.observerName);
    }
    
}
