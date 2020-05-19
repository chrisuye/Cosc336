package objectAdventure.creatures;

import static java.util.Collections.unmodifiableList;
import java.util.List;
import objectAdventure.items.Item;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public class Player {

    private int currentRoom;
    private List<Item> inventory;
    private final String playerName;

    /**
     *
     * @param playerName
     */
    public Player(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the currentRoom
     */
    public int getCurrentRoom() {
        return currentRoom;
    }

    /**
     * @param currentRoom the currentRoom to set
     */
    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

    /**
     * @return the inventory
     */
    public List<Item> getInventory() {
        return unmodifiableList(inventory);
    }

    /**
     * @param item item to add to inventory
     */
    public void addToInventory(Item item) {
        inventory.add(item);
    }

    /**
     * @param item item to remove from inventory.
     */
    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player{" + "currentRoom=" + currentRoom + ", inventory=" + inventory + ", playerName=" + playerName + '}';
    }

}
