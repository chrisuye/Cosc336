package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;

/**
 *
 * @author jhamil15
 */
public class Bow implements Item{

    @Override
    public String getItemDescription() {
        return "A very strong Bow. It radiates with a purple hue and when fired, one arrow is magically split into 3 and fired. You rest easy knowing you just obtained an enchanted Bow with arrows.";
    }

    public String receivedItemDescription() {
        return "You picked up the Enchated Bow";
    }
    
    public String droppedItemDescription() {
        return "You dropped the Enchanted Bow";
    }
    
}