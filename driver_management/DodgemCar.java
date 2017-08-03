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

  public int numOfSeats(){
    return this.numSeats;
  }
}