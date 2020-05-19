package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;

public class FidgetSpinner implements Item {

    public String getItemAuthor() {
        return "Artemio Fernandez";
    }

    @Override
    public String getItemDescription() {
        return "A small 3 winged object able to spin indefinitely by holding the center";
    }

}
