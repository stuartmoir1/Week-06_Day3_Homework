package driver_management; // Access all java files in dir driver_management.
import behaviours.*; // Access all java files in dir behaviours.

// Interfaces w/ interface Driveable.
public class DodgemCar implements Driveable {

  // Instance variables.
  private int averageSpeed;
  private int numSeats;

  // Constructor.
  public DodgemCar(int averageSpeed, int numSeats){
    this.averageSpeed = averageSpeed;
    this.numSeats = numSeats;
  }

  // Methods

  // Required by contract in the interface 'Driveable'.
  public int driveTime(int distance){
    return distance / this.averageSpeed;
  }

  public int numOfSeats(){
    return this.numSeats;
  }
}