package objectAdventure.creatures;

import java.util.Collections;
import java.util.List;
import objectAdventure.patternInterfaces.Observer;
/**
 * @author Adam J. Conover, D.Sc. <aconover@towson.edu>
 */
public interface Creature extends Observer{
    
    public String getCreaturesDescription();
    
    
    public default List<String> getAlias() {
        return Collections.unmodifiableList(List.of());
    }

}
