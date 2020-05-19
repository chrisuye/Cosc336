package objectAdventure.creatures;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adam J. Conover, D.Sc. <aconover@towson.edu>
 */
public class Creature implements Observer<T> {

	   private List<Observer> observers = new ArrayList<Observer>();
	   private int state;

	   public int getState() {
	      return state;
	   }

	   public void setState(int state) {
	      this.state = state;
	      notifyAllObservers();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   }

		   public CreatureObserver(Subject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }


		}
	   
	   
	

