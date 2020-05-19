package DesignPatterns.Decorator.ItemStore;

public class CursedItem extends ItemDecorator {

    public CursedItem(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getCursedDescription() + " with a Curse";
    }

}
