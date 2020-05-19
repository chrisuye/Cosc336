/**
 *
 * @author Steve J Cevallos
 */

package objectAdventure.creatures.creatureImpl;
import objectAdventure.creatures.Creature;

public class DogCat implements Creature {
    
    @Override
    public String getCreaturesDescription(){
        return "It is a Dog head with the body and agility of a Cat";
    }
}
