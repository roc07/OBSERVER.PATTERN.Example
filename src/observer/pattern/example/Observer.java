package observer.pattern.example;

public abstract class Observer {
  
  public Subject subject;
  
  public abstract void update(int number);
  
}
