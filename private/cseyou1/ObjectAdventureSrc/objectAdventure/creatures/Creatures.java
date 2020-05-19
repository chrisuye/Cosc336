/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.creatures;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author chris
 */
public interface Creatures extends Observer {
    
    /**
     * Generate the description of an item.
     *
     * @return A simple item description
     */
    public String getCreaturesDescription();

    

    /**
     * Short Names lists for use in picking up and removing items.
     *
     * @return A list containing the aliases (short names) for an item.
     */
    public default List<String> getAliasList() {
        return Collections.unmodifiableList(List.of());
    }
    
}
