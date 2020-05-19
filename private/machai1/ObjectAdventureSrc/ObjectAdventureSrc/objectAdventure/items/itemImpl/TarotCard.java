package objectAdventure.items.itemImpl;
import java.util.Random; //i hope this is ok

import objectAdventure.items.Item;
public class TarotCard implements Item {
	
    public String getItemAuthor() {
        return "Sean Smith";
    }
    //Tarot Card doesn't have any actual function - it's just to intrigue the player and make them think about how it *could* affect them
    final String[] card = {
    		"A roughed up Tarot Card, it doesn't look particularly special.\nIt has the words \"The Balance\" at the top with a large picture of the Sun surrounded by flames. \nThere is a seal of the Sun at the top of the card.",
    		"A roughed up Tarot Card, it doesn't look particularly special.\nIt has the words \"The Arrow\" at the top with a large picture of an arrow piercing the wind.\nThere is a seal of a crescent waxing Moon at the top of the card.", 
    		"A roughed up Tarot Card, it doesn't look particularly special.\nIt has the words \"The Spear\" at the top with a large picture of a snowflake falling with snow.\nThere is a seal of a full Moon at the top of the card.",
    		"A roughed up Tarot Card, it doesn't look particularly special.\nIt has the words \"The Bole\" at the top with a large picture of what looks to be a tree with sprouting roots surrounded by greenery.\nThere is a seal of the Sun at the top of the card.",
    		"A roughed up Tarot Card, it doesn't look particularly special.\nIt has the words \"The Ewer\" at the top with a large picture of what looks to be a cyan painted ancient urn.\nThere is a seal of a crescent waxing Moon at the top of the card.",
    		"A roughed up Tarot Card, it doesn't look particularly special.\nIt has the words \"The Spire\" at the top with a large picture of two yellow lightning bolts.\nThere is a seal of a full Moon at the top of the card."
    		};
    
    //randomness
    Random random = new Random();
    int cardIndex = random.nextInt(card.length);
    
    String pickedCard = card[cardIndex];
    
    public String getItemDescription() {
        return pickedCard;
    }
}

