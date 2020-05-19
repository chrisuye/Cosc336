/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.creatures.creatureImpl;

import objectAdventure.creatures.Creature;
/**
 *
 * @author ieuric1
 */
public class Mimic implements Creature {
    
    @Override
    public String getCreaturesDescription(){
        return "These creatures assume the most of mundane object in order to lure their prey";
    }
}
