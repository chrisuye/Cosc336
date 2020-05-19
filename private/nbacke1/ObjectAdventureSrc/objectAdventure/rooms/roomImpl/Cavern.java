package objectAdventure.rooms.roomImpl;/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
//import java.util.ArrayList;
import java.util.*;

import objectAdventure.items.Item;
import objectAdventure.items.itemImpl.*;
import objectAdventure.rooms.NormalRoom; 
 
/** 
 * 
 * @author nbacke1
 */ 
public class Cavern extends NormalRoom { 
 
	private static final int ROOM_ID = 8;
	private static final String desc = "This is a small cave with entrances east (where you came) and"
			+ " a dark, forbidding staircase leading down (south).";
	private static final String creaturedesc = "The behir is blue in color with a long narrow head, "
			+ "crocodilian in shape, with curved, black horns on the top, used for preening. Its mouth "
			+ "is full of many sharp teeth. This creature is 40 feet long and weighs two tons. Behirs "
			+ "are expert climbers and it hides on the ceiling and sides of the cavern.";
	
	
    @Override 
    public String getRoomAuthor() { 
        return "Nicole Backert"; 
    } 
 
    /** 
     * 
     * @param roomId 
     */ 
    public Cavern() { 
        super(ROOM_ID); 
        super.setDescription(desc); 
        super.setCreatureDescription(creaturedesc);
        super.itemList.add(new Flashlight());
        super.itemList.add(new Batteries());
    } 
 
    /**
     *
     * @return Description of the room
     
    public String getDescription() {
        return "This is a tiny cave with entrances east (where you came) and a dark, forbidding staircase leading down (south).";
    }

    /**
     *
     * @return the Assigned ID of the room.
     
    public Integer getRoomId() {
    	return 8;
    }*/

    /**
     *
     * @return A list of any items found in the room
     
    public List<Item> getItems(){
    	List<String> Items = new List<String> ();
    	Items.add(Flashlight);
    	return Item<Flashlight>;
    }
    */
}
    