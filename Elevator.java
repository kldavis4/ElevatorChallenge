/** * Interface that defines what an Elevator can do */
public interface Elevator {  
  
  public static final int MIN_FLOOR = 1; 
  public static final int MAX_FLOOR = 20;
  
  public void goUp();  
  public void goDown();  
  public ElevatorDirection getDirection();  
  public void addNewDestination(Integer destination);  
  public void removeDestination();  
  public ElevatorStatus getStatus();  
  public void ringAlarm();
}
