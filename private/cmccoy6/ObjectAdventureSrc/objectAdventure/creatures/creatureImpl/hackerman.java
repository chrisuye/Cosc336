/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.creatures.creatureImpl;

import objectAdventure.creatures.Creature;
import objectAdventure.patternInterfaces.Observable;
import objectAdventure.patternInterfaces.Observer;

/**
 *
 * @author cmccoy6
 */
public class hackerman implements Creature {

    @Override
    public String getCreaturesDescription(){
        return "What's he doing to the mainframe?";
    }

    @Override
    public Observer setCreatureObserve(Observable obj, Object arg) {
        return null;
    }

    @Override
    public void update(Object value) {

    }
}
