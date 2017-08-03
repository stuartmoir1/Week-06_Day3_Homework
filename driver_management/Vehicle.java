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
  public String goodToDrive(){
    return "Yes!";
  }

}