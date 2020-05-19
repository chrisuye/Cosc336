package objectAdventure.items;

public abstract class ItemDecorator implements Item {
    protected Item decorated;

    public ItemDecorator(Item decorated){
        this.decorated = decorated;
    }

    public String enchantment(){
        return "Cursed";
    }

}
