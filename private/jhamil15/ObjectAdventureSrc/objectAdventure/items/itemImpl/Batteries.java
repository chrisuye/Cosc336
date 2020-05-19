package objectAdventure.items.itemImpl;

import java.util.List;

import objectAdventure.items.Item;

public class Batteries implements Item {

    boolean isAnchored = false;
    
    public String getItemAuthor() {
        return "Nicole Backert";
    }

    @Override
    public String getItemDescription() {
        return "Two generic brand double A batteries. They're old and dirty. Who knows if they even hold a charge.";
    }
    
    /** 
     * Item Can be picked up and moved.
     * 
     * @return  True
     */
    @Override
    public boolean isTransferable() {
        return !isAnchored;
    }

    @Override
    public List<String> getAliasList() {
        return List.of("Batteries","Battery");               
    }

}
