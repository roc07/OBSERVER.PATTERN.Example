package observer.pattern.example;

public class MediumNumber extends Observer {

  private boolean isHappy;
  private String type;
  
  public MediumNumber(){
    this.isHappy = false;
    this.type = "Medium Number Observer";
  }
  
  private void setIsHappy(boolean good){
    this.isHappy = good;
  }
  
  public boolean getIsHappy(){
    return this.isHappy;
  }
  
  @Override
  public void update(int number) {
    if (number <= 20 && number > 10){
      setIsHappy(true);
    }
        
    System.out.println(this.type + "is happy: " + getIsHappy());
  }

}
