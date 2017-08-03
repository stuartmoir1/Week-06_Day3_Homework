package driver_management;
import behaviours.*;

// Interfaces w/ interface Driveable.
public class QuadBike extends Vehicle implements Driveable{

  // Instance variables.
  private int engineCapacity;

  // Constructor.
  public QuadBike(int averageSpeed, int engineCapacity){
    super(averageSpeed);
    this.engineCapacity = engineCapacity;
  }

  // Methods

  // Required by contract in the interface 'Driveable'.
  public int driveTime(int distance){
    return distance / this.averageSpeed;
  }

  public int capacityOfEngine(){
    return this.engineCapacity;
  }
}