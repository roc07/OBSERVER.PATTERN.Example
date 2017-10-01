package observer.pattern.example;

public class OBSERVERPATTERNExample {

  public static void main(String[] args) {
    
    Subject valueOfItemX = new Subject(30);
    
    Observer small = new SmallNumber();
    Observer medium = new MediumNumber();
    Observer large = new LargeNumber();
    
    
    
  }
  
}
