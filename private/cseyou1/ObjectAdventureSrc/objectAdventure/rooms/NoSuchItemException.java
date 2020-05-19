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
public class NoSuchItemException extends RuntimeException {
    

    public NoSuchItemException(Integer itemId) {
        super(format("The item id={0} does not exist.", itemId));
    }

}
    
