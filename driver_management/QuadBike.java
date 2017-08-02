package driver_management;
import behaviours.*;

// Interfaces w/ interface Driveable.
public class QuadBike implements Driveable {

  // Instance variables.
  private int averageSpeed;
  private int engineCapacity;

  // Constructor.
  public QuadBike(int averageSpeed, int engineCapacity){
    this.averageSpeed = averageSpeed;
    this.engineCapacity = engineCapacity;
  }

  // Required by contract in the interface 'Driveable'.
  public int driveTime(int distance){
    return distance / this.averageSpeed;
  }

  // public int capacityOfEngine(){
  //   return this.engineCapacity;
  // }
}