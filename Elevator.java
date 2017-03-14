/** * Interface that defines what an Elevator can do */
public interface Elevator {  
  public void goUp();  
  public void goDown();  
  public ElevatorDirection getDirection();  
  public void addNewDestination(Integer destination);  
  public void removeDestination();  
  public ElevatorStatus getStatus();  
  public void ringAlarm();
}
