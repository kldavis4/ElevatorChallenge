/**
 *  * Interface for the elevator control system 
 */
public interface ElevatorControlSystem {
      

    public void monitor();
      

    public void pickUpPassenger(Integer pickUpFloor);
      

    public void toDestination(Integer elevatorId, Integer destinationFloor);
}
