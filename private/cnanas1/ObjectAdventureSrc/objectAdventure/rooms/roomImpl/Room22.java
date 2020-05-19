package objectAdventure.rooms.roomImpl;
import objectAdventure.items.itemImpl.TarotCard;
import objectAdventure.rooms.NormalRoom;

/*
* @author Sean Smith, COSC436
*/

public class Room22 extends NormalRoom {

    @Override
    public String getRoomAuthor() {
        return "Sean Smith";
    }
    
    /*
    * @param roomId
    */
   public Room22(int roomId) {
       super(roomId);
       super.setDescription( "This is the 22nd room.");
       super.itemList.add(new TarotCard());
   }

}
