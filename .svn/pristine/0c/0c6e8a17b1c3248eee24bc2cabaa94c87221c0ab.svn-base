package objectAdventure.rooms;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import objectAdventure.rooms.roomImpl.SecretTestingRoom;
import objectAdventure.rooms.roomImpl.StartRoom;
import objectAdventure.rooms.roomImpl.Room23;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public class Configuration_RoomList {
    private static final Logger LOG = Logger.getLogger(Configuration_RoomList.class.getName());
    
    private final Map<Integer, Room> roomList = new TreeMap<>();

    /**
     * Constructor to init all rooms
     */
    public Configuration_RoomList() {
        initRooms();
    }

    /**
     *
     * @param roomId
     *
     * @return The room object from the ID.
     * @throws NoSuchRoomException
     */
    public Room getRoom(int roomId) throws NoSuchRoomException {

        final var room = roomList.get(roomId);
        if (room == null) {
            throw new NoSuchRoomException(roomId);
        } else {
            return room;
        }
    }

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
        addRoom(new Room23(23));
    }
}
