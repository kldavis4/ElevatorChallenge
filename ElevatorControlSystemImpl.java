import java.util.ArrayList;
import java.util.LinkedList;

/**
 *  
 */
public class ElevatorControlSystemImpl implements ElevatorControlSystem {
     
    public static final int MAX_ELEVATORS = 6;
    //We are setting the max number of floors as 20, this can be changed but we need to know how many floors there are  private ArrayList<Elevator> elevators;
      
    private LinkedList<Integer> pickupLocations;
      
    private Integer numberOfElevators = 0;
      
    private Integer numberOfFloors = 0;
       /**   * Default constructor   */
              

    public ElevatorControlSystemImpl(Integer numberOfElevators, Integer numberOfFloors) {
            this.numberOfElevators = (numberOfElevators > MAX_ELEVATORS) ? MAX_ELEVATORS : numberOfElevators;
            this.numberOfFloors = numberOfFloors;
            this.pickupLocations = new LinkedList<Integer>();
            initializeElevators();
      }
      

    private void initializeElevators() {   elevators = new ArrayList<Elevator>();   
        for (int i = 0; i < numberOfElevators; i++) {     elevators.add(new ElevatorImpl(Elevator.MIN_FLOOR));   } } 

    public Integer getNumberOfElevators() {  return this.numberOfElevators; } 

    public Integer getNumberOfFloors() {  return this.numberOfFloors; } 

    public ArrayList<Elevator> getElevators() {   return elevators; } 
    @Override 

    public void pickUpPassenger(Integer pickUpFloor) {   pickupLocations.add(pickUpFloor); } 
    @Override 

    public void toDestination(Integer elevatorId, Integer destinationFloor) {   
        elevators.get(elevatorId).addNewDestination(destinationFloor); } 
    @Override 

    public void monitor() {    //Go through all the elevators and determine their status    for (Elevator elevator : elevators){      //Determine which elevator is empty - if empty add a destination and if it's not empty take the appropriate actioon      switch (elevator.getStatus()){        case ELEVATOR_EMPTY:          if (!pickupLocations.isEmpty())            elevator.addNewDestination(pickupLocations.poll());          break;        // Loop through each occupied elevator and move them in the proper direction or ring an alarm if holding        case ELEVATOR_OCCUPIED:          switch (elevator.getDirection()){            case ELEVATOR_UP:              elevator.goUp();              break;            case ELEVATOR_DOWN:              elevator.goDown();              break;            case ELEVATOR_HOLDING:              elevator.ringAlarm();              break;          }      }    }  }}
