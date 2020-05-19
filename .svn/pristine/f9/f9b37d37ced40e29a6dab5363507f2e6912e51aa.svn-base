package objectAdventure.rooms;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import objectAdventure.rooms.roomImpl.*;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public class Configuration_RoomList implements ItemIterator, CreatureIterator {
    private static final Logger LOG = Logger.getLogger(Configuration_RoomList.class.getName());
    
    private final Map<Integer, Room> roomList = new TreeMap<>();
    private final Map<Integer, Item> itemList = new TreeMap<>();
    private final Map<Integer, Creature> creatureList = new TreeMap<>();

    class ItemIter implements Iterator<Item>{
    	@Override 
    	final var item = itemList.get(item));
    	public boolean hasNext(){
            if(index < item.length){
                return true;
             }
             return false;
    	}

    	@Override
    	public Item next() {
    		if(this.hasNext()){
                return item[index++];
             }
             return null;
    	} 
    	
    	public ItemIter getItemIter() {
    		return new ItemIter();
    	}
    

    	class CreatureIter implements Iterator<Item>{
        	@Override 
        	final var creature = creatureList.get(creature));
        	public boolean hasNext(){
                if(index < creature.length){
                    return true;
                 }
                 return false;
        	}

        	@Override
        	public Creature next() {
        		if(this.hasNext()){
                    return creature[index++];
                 }
                 return null;
        	} 
        	
        	public CreatureIter getItemIter() {
        		return new CreatureIter();
        	}
        
        	
    	/*
        public void printItems() {
        	for (var room: roomList.values()) {
        		for (var item : room.getItems()) {
        			System.out.printlin(item);
        		}
        	}
        }*/

    
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
    // TODO: Add your room here once complete.
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
}
