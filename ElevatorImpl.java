import java.util.LinkedList;

/**
 *  * Elevator implementation 
 */
public class ElevatorImpl implements Elevator { 
    private Integer currentFloor; 
    private LinkedList<Integer> destinationFloors; 
    private static final int MAX_NUMBER_OF_TRIPS = 100; 
    private int numberOfTrips = 0; 

    public ElevatorImpl(Integer currentFloor) {   this.currentFloor = currentFloor;   
        this.destinationFloors = new LinkedList<Integer>(); }  /**   * Return the next destination   */ 

    public int nextDestination() {   return this.destinationFloors.peek(); }  /**   * Return the current floor   */ 

    public int getCurrentFloor() {   return this.currentFloor; } 

    public int getNumberOfTrips() {  return numberOfTrips; } 

    private void addNumberOfTrips() {
        //throw exception if you try to add more than the max number of trips  
        //if(numberOfTrips < MAX_NUMBER_OF_TRIPS) numberOfTrips++;  } 
    }
    ///**   * Remvoe the desitinator from the our destinations   */  
    //@Override  public void removeDestination(){    this.destinationFloors.remove();    this.numberOfTrips--;  }
    
    //@Override  public void addNewDestination(Integer destination) {    this.destinationFloors.add(destination);    this.numberOfTrips++;  }

    //@Override  /**   * Move the elevator up one floor   */  public void goUp() {     if(currentFloor < MAX_FLOOR) currentFloor++;  } 

    ///**   * Regturn the Elevator current direction   * @return ElevatorDirection   */ 
    //@Override  public ElevatorDirection getDirection() {   
    //  if (destinationFloors.size() > 0){     
    //      if (currentFloor < destinationFloors.peek()){       
    //          return ElevatorDirection.ELEVATOR_UP;      }     
    //      else if (currentFloor > destinationFloors.peek()) {       
    //          return ElevatorDirection.ELEVATOR_DOWN;     
    //      }   
    //  }    return ElevatorDirection.ELEVATOR_HOLDING;  } 

    // /**   * Move the elevator down 1 floor   */ 
    //@Override  public void goDown() {    if(currentFloor >= MIN_FLOOR) currentFloor--;  } 

    //@Override  public void openDoor() {    //add a status to an enum and flag that the elevator is open  }

    //@Override  public void closeDoor() { //add a status to an enum and flag that the elevator is closed  } 

    ///**   * Return the status of the elevator   * @return ElevatorStatus   */ 
    //@Override  public ElevatorStatus getStatus() {   
    // return (destinationFloors.size() > 0) ? ElevatorStatus.ELEVATOR_OCCUPIED : ElevatorStatus.ELEVATOR_EMPTY; 
    // }

    //@Override  public ElevatorMode getMode() {  
    //  if(getNumberOfTrips() == MAX_NUMBER_OF_TRIPS)
    //   return ElevatorMode.ELEVATOR_MAINTENANCE;  
    //  else return ElevatorMode.ELEVATOR_IN_SERVICE; 
    // }

    // /**   * Move the elevator down 1 floor   */
    //@Override  public void ringAlarm() {   
    // To do -- alert the user that they are holding the door   
    // just similate a beep  Toolkit.getDefaultToolkit().beep(); 
    //}}
}