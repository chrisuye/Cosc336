package objectAdventure.creatures;

import objectAdventure.patternInterfaces.Observable;
import objectAdventure.patternInterfaces.Observer;

import java.util.Collections;
import java.util.List;
/**
 * @author Adam J. Conover, D.Sc. <aconover@towson.edu>
 */
public interface Creature extends Observer {
    
    public String getCreaturesDescription();

    public Observer setCreatureObserve(Observable obj, Object arg);
    
    public default List<String> getAlias() {
        return Collections.unmodifiableList(List.of());
    }

}
