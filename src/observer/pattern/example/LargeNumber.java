package observer.pattern.example;

public class LargeNumber extends Observer {

  private boolean isHappy;
  private String type;
  
  public LargeNumber(){
    this.isHappy = false;
    this.type = "Large Number Observer";
  }
  
  private void setIsHappy(boolean good){
    this.isHappy = good;
  }
  
  public boolean getIsHappy(){
    return this.isHappy;
  }
  
  @Override
  public void update(int number) {
    if (number > 20){
      setIsHappy(true);
    }
            
    System.out.println(this.type + "is happy: " + getIsHappy());
  }

}
