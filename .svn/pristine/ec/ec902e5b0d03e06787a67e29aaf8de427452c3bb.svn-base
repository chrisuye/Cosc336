package objectAdventure.rooms;

import java.util.*;
import objectAdventure.creatures.DefaultPlayer;
import objectAdventure.items.Item;
import objectAdventure.items.ItemInteraction;
import objectAdventure.creatures.Creatures;

/**
 * A very thin wrapper for a normal room. Other Room types may be added later.
 *
 * @author Adam J. Conover, COSC436
 */
public abstract class NormalRoom implements Room {

    private String description;

    /**
     *
     */
    protected Integer roomId;

    /**
     *
     */
    protected List<Item> itemList;
    protected List<Creatures> creatureList;
    
    /**
     * Constructor for just a normal room. (Other types of rooms may exist: secret, etc.)
     *
     * @param roomId the numeric ID of the room.
     */
    protected NormalRoom(int roomId) {
        this.roomId = roomId;
        this.itemList = new LinkedList<>();
        this.creatureList = new LinkedList<>();
    }

    /**
     * Not yet Used. (Stub for players to be able to interact with items.)
     *
     * @param interaction Interaction Object Describing how we want to interact with the object.
     * @param player The player interacting with the object.
     */
    public void processInteraction(ItemInteraction interaction, DefaultPlayer player) {
        System.out.println("There is nothing yet to do in this room with: " + interaction);
    }

    /**
     *
     * @return The description of the room.
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    protected void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns a copy of the item List.
     *
     * @return The items in the room.
     */
    @Override
    public List<Item> getItems() {
        return new ArrayList<>(itemList);
    }
    
    @Override
    public List<Creatures> getCreatures() {
        return new ArrayList<>(creatureList);
    }

    @Override
    public boolean removeItem(Item item) {
        if (item.isTransferable()) {
            this.itemList.remove(item);
            return true;
        }
        return false;
    }

    @Override
    public void addItem(Item item) {
        this.itemList.add(item);
    }
    
    @Override
    public void addCreature(Creature creature) {
        this.creatureList.add(creature);
    }
    /**
     *
     * @return The RoomID
     */
    @Override
    public Integer getRoomId() {
        return this.roomId;
    }

}
