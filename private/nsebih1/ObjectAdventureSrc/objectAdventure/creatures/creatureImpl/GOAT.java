/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectAdventure.creatures.creatureImpl;
import objectAdventure.creatures.Creatures;
import objectAdventure.items.Observable;

/**
 *
 * @author nebiyusebihat
 */
public class GOAT implements Creatures{
    private String theObserver = "GOAT";

   
  public String getCreaturesDescription() {
        return"KOBE BRYANT";
    }  
  
    public void update(Object value) {
        final String msgTmpl = "Observer %s has been notified that the items have been picked up\n";
        System.out.printf(msgTmpl, this.theObserver);
    }

}
