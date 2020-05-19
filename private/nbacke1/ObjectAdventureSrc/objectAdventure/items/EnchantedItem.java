import DesignPatterns.Observer.Observable;
import DesignPatterns.Observer.Observer;
import java.util.LinkedList;
import java.util.List;

public class EnchantedItem extends ItemDecorator implements Observable<EnchantedChange> {

    private Float addedValue;
    List<Observer<EnchantedChange>> observers = new LinkedList<>();

    public EnchantedItem(Item item, Float enhancedValue) {
        this.item = item;
        this.addedValue = enhancedValue;
    }

    public EnchantedItem(Item item, Float enhancedValue, Observer<EnchantedChange> observer) {
        this(item, enhancedValue);
        this.observers.add(observer);
    }

    @Override
    public String getDescription() {
        return item.getEnchantedDescription();
    }

    @Override
    public void addObserver(Observer<EnchantedChange> o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer<EnchantedChange> o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(obj -> obj.update(new EnchantedChange(this)));
    }

}

/**
 * A message container for changes in an enchanted item's value. (Perhaps it's
 * value decreases every so many turns and notifies creatures that the value is
 * decreasing.. or whatever...)
 *
 * @author Adam J. Conover, D.Sc. <aconover@towson.edu>
 */
class EnchantedChange {

    private EnchantedItem item;

    public String getDescription() {
        return item.getDescription();
    }

    public EnchantedChange(EnchantedItem item) {
        this.item = item;
    }

}
