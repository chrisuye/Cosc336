package objectAdventure.rooms;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import objectAdventure.items.Item;
import objectAdventure.rooms.roomImpl.*;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public class Configuration_RoomList {
    private static final Logger LOG = Logger.getLogger(Configuration_RoomList.class.getName());
    
    private final Map<Integer, Room> roomList = new TreeMap<>();
    private final Map<Integer, Item> itemList = new TreeMap<>();
    private final Map<Integer, Item> creatureList = new TreeMap<>();
    
    

    /**
     * Constructor to init all rooms
     */
    public Configuration_RoomList() {
        
        initRooms();
    }

    /**
     *
     * @param roomId the ID of the room to retrieve.
     *
     * @return The room object from the ID.
     * @throws NoSuchRoomException thrown if the room does not exist.
     */
    public Room getRoom(int roomId) throws NoSuchRoomException {

        final var room = roomList.get(roomId);
        if (room == null) {
            throw new NoSuchRoomException(roomId);
        } else {
            return room;
        }
    }
public Item getItem(int itemId) throws NoSuchItemException{

        final var item = itemList.get(itemId);

        if(item == null){

            throw new NoSuchRoomException(itemId);

        }else{

            return item;

        }

    }

    

    public Item getCreature(int creatureId) throws NoSuchCreatureException{

        final var creature = creatureList.get(creatureId);

        if(creature == null){

            throw new NoSuchRoomException(creatureId);

        }else{

            return creature;

        }

    }


    /** 
     * Add a Room Object to the map.
     * 
     * @param room The room object being added to the map.
     */
    private void addRoom(Room room) {
        Integer roomId = room.getRoomId();

        if (roomId == null) {
            System.err.printf("Cannot add room %d. It has no ID!!!", roomId);
        } else {
            roomList.put(roomId, room);
            LOG.log(Level.CONFIG, "Added room {0}: {1}", new Object[]{roomId, room});
        }
    }


    /* ***************************************************************************** */
    // TODO: Add your room here one complete.
    private void initRooms() {
        addRoom(new StartRoom());
        addRoom(new SecretTestingRoom());
        addRoom(new Room30(30));  
        addRoom(new Room01(1));
        addRoom(new Room3(3));
        addRoom(new Room4(4));
        addRoom(new Room05(5));
        addRoom(new Room06(6));
        addRoom(new Room7(7));
        addRoom(new Room09(9));
        addRoom(new Room11(11));
        addRoom(new Room12(12));
        addRoom(new Room13(13));
        addRoom(new Room14a(14));
        addRoom(new Room15(15));
        addRoom(new Room16());
        addRoom(new Room17(17));
        addRoom(new Room19());
        addRoom(new Room25(25));
        addRoom(new Room21());
        addRoom(new Room22(22)); 
        addRoom(new Room23(23));
        addRoom(new Room26());
        addRoom(new Room27(27));  
        addRoom(new Room21());
        addRoom(new Room30(30));
        addRoom(new DoNotEnter());
        addRoom(new Cavern());
    }

    private static class NoSuchItemException extends Exception {

        public NoSuchItemException() {
        }
    }
}
