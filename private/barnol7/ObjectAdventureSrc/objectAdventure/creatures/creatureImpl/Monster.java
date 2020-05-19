/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.creatures.creatureImpl;
import objectAdventure.creatures.Creature;

/**
 *
 * @author barnol7
 */
public class Monster implements Creature {
    
    @Override
    public String getCreaturesDescription(){
        return "Hi ! Im Mike Wazowski | I am one of the main characters in Monsters INC";
    }
}