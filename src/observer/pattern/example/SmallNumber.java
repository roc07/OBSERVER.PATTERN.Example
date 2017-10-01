package observer.pattern.example;

public class SmallNumber extends Observer {

  private boolean isHappy;
  private String type;
  
  public SmallNumber(){
    this.isHappy = false;
    this.type = "Small Number Observer";
  }
  
  private void setIsHappy(boolean good){
    this.isHappy = good;
  }
  
  public boolean getIsHappy(){
    return this.isHappy;
  }
  
  @Override
  public void update(int number) {
    if (number <= 10){
      setIsHappy(true);
    }
    
    System.out.println(this.type + "is happy: " + getIsHappy());
  }

}
