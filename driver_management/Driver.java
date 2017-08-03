package driver_management;
import behaviours.*;

public class Driver{

  // Instance variables.
  private String name;
  private Driveable vehicle;

  // Constructor.
  public Driver(String name, Driveable vehicle){
    this.name = name;
    this.vehicle = vehicle;
  }

  // Methods.
  public String getName(){
    return this.name;
  }

  public Driveable getVehicle(){
    return this.vehicle;
  }

  public int driveTime(int distance){
    return this.vehicle.driveTime(distance);
  }

  public void setVehicle(Driveable vehicle){
    this.vehicle = vehicle;
  }

}