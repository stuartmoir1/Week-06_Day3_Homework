package driver_management;
import behaviours.*;

// Interfaces w/ interface Driveable.
public class DodgemCar extends Vehicle implements Driveable{

  // Instance variables.
  private int numSeats;

  // Constructor.
  public DodgemCar(int averageSpeed, int numSeats){
    super(averageSpeed);
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