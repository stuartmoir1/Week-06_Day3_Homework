package driver_management;
import behaviours.*;

public class Vehicle{

  // Instance variables.
  protected int averageSpeed;

  // Constructor
  public Vehicle(int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  // Methods.

  // Required by contract in the interface 'Driveable'.
  public int driveTime(int distance){
    return distance / this.averageSpeed;
  }
  
  public String goodToDrive(){
    return "Yes!";
  }

}