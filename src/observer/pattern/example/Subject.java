package observer.pattern.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  
  private List<Observer> observers = new ArrayList<Observer>();
  private int currentState;
  
  public Subject(int state){
    changeCurrentState(state);
  }
  
  public void changeCurrentState(int change){
    this.currentState = change;
  }
  
  public void attachObserver(Observer observer){
    this.observers.add(observer);
  }
  
  public void notifyAllObervers(){
    for (Observer obs : this.observers){
      obs.update(this.currentState);
    }
  }
  
  
  
}
