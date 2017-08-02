import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  DodgemCar car;
  QuadBike bike;
  Driver driver;

  @Before public void before(){
    car = new DodgemCar(10, 2);
    bike = new QuadBike(10, 500);
    driver = new Driver("Stuart", car);
  }

  @Test public void hasName(){
    assertEquals("Stuart", driver.getName());
  }

  @Test public void hasCar(){
    // Casting
    DodgemCar car = (DodgemCar) driver.getVehicle();
    assertEquals(2, car.numOfSeats());
  }

  @Test public void driverVehicleDriveTimeCar(){
    assertEquals(1, driver.driveTime(10));
  }

  @Test public void driverVehicleDriveTimeBike(){
    Driver driver = new Driver("Stuart", bike);
    assertEquals(1, driver.driveTime(10));
  }

  // Strategy (architectural) pattern.
  @Test public void canSetVehicle(){
    driver.setVehicle(car);
    assertEquals(1, driver.driveTime(10));
  }

}