package objectAdventure.structure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static objectAdventure.structure.Direction.*;
import static java.util.List.of;

/**
 *
 * @author Adam J. Conover, COSC436
 */
public class GameMap {

    private static final Direction DIR_ORDER[] = {NORTH, EAST, SOUTH, WEST};
    private final Map<Integer, List<Integer>> map = new HashMap<>();

    /**
     *
     * @return
     */
    public static GameMap getMap() {
        return new GameMap();
    }

    /**
     * Adjacency lists of all rooms in the map. (N, E, S, W)
     * 
     * (Chose not to use an arbitrary direction list to keep things simpler).
     */
    public GameMap() {
        map.put(0, of(9, 16, 22, 99));
        map.put(1, of(-1, 2, -1, -1));
        map.put(2, of(-1, 3, 7, 1));
        map.put(3, of(-1, -1, 9, 2));
        map.put(4, of(-1, 5, -1, -1));
        map.put(5, of(-1, -1, 12, 4));
        map.put(6, of(-1, 7, -1, -1));
        map.put(7, of(2, -1, -1, 6));
        map.put(8, of(-1, 9, 15, -1));
        map.put(9, of(3, 10, 0, 8));
        map.put(10, of(-1, -1, -1, 9));
        map.put(11, of(-1, 12, 17, -1));
        map.put(12, of(5, -1, 18, 11));
        map.put(13, of(-1, 14, -1, -1));
        map.put(14, of(-1, 15, 20, 13));
        map.put(15, of(8, -1, -1, 14));
        map.put(16, of(-1, 17, 23, 0));
        map.put(17, of(11, -1, 24, 16));
        map.put(18, of(12, -1, -1, -1));
        map.put(19, of(-1, 20, 26, -1));
        map.put(20, of(14, 21, -1, 19));
        map.put(21, of(-1, 22, 28, 20));
        map.put(22, of(0, -1, 29, 21));
        map.put(23, of(16, -1, -1, -1));
        map.put(24, of(17, 25, 30, -1));
        map.put(25, of(-1, -1, 31, 24));
        map.put(26, of(19, -1, -1, -1));
        map.put(27, of(-1, 28, -1, -1));
        map.put(28, of(21, -1, -1, 27));
        map.put(29, of(22, 30, -1, -1));
        map.put(30, of(24, -1, -1, 29));
        map.put(31, of(25, -1, -1, -1));
        map.put(99, of(-1, 0, -1, -1));
    }

    /**
     * Mostly for debugging, but check to see if a room with a given id exists in on the map.
     *
     * @param roomId
     * @return
     */
    public boolean doesExist(int roomId) {
        return map.containsKey(roomId);
    }

    /**
     * Get a list of all the exit connections from a given room.
     * @param roomId
     * @return
     */
    public Map<Direction, Integer> getExitConnections(Integer roomId) {

        var roomList = map.get(roomId);
        Map<Direction, Integer> connections = new HashMap<>();

        for (var i = 0; i < 4; i++) {
            var destRoomId = roomList.get(i);
            if (destRoomId >= 0) {
                connections.put(DIR_ORDER[i], roomList.get(i));
            }
        }

        return connections;
    }

}
