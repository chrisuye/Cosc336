/**
 *
 * @author SteveJCevallos
 */

package objectAdventure.rooms.roomImpl;
import objectAdventure.rooms.NormalRoom;
import objectAdventure.items.itemImpl.BeerBottle;
import objectAdventure.creatures.creaturesImpl.DogCat;

public class Room02 extends NormalRoom {

    @Override
  
    public String getRoomAuthor(){
        return "Steve Cevallos";
    }
    
    public Room02(int roomId) {
        super(roomId);

        super.setDescription( "This is the 2nd room. Where all dreams come true."
        + "In this room there is a BeerBottle that you must drink and it makes all of your dreams true" 
        + "Also the DogCat is your sidekick that will help you find the exit to the room and keep you safe");
        super.itemList.add(new BeerBottle());
        super.itemList.add(new WiskeyBottle());
        super.itemList.add(new RyeBottle());
        super.creaturesImpl.add(new DogCat());
    }  
}
