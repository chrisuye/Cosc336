package objectAdventure.creatures;

import static java.util.Collections.unmodifiableList;
import java.util.List;
import objectAdventure.items.Item;

/**
 * The player is a "Creature" since the player is something that may exist within a room that is not
 * an inanimate object (Item).
 * 
 * @author Adam J. Conover, COSC436
 */
public class DefaultPlayer implements PlayerCharacter {

    private int currentRoom;
    private List<Item> inventory;
    private final String playerName;

    /**
     *
     * @param playerName
     */
    public DefaultPlayer(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the currentRoom
     */
    @Override
    public int getCurrentRoom() {
        return currentRoom;
    }

    /**
     * @param currentRoom the currentRoom to set
     */
    @Override
    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

    /**
     * @return the inventory
     */
    @Override
    public List<Item> getInventory() {
        return unmodifiableList(inventory);
    }

    /**
     * @param item item to add to inventory
     */
    @Override
    public void addToInventory(Item item) {
        inventory.add(item);
    }

    /**
     * @param item item to remove from inventory.
     */
    @Override
    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }

    /**
     * @return the playerName
     */
    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player{" + "currentRoom=" + currentRoom + ", inventory=" + inventory + ", playerName=" + playerName + '}';
    }

}
