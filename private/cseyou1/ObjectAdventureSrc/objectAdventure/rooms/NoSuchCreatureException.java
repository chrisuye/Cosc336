/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.rooms;

import static java.text.MessageFormat.format;

/**
 *
 * @author chris
 */
public class NoSuchCreatureException extends RuntimeException{
    
    public NoSuchCreatureException(Integer creatureId) {
        super(format("The Creature id={0} does not exist.", creatureId));
    }
}
