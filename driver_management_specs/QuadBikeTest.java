import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike bike;

  @Before public void before(){
    bike = new QuadBike(10, 500);
  }

  @Test public void bikeDriveTime(){
    assertEquals(2, bike.driveTime(20));
  }

  @Test public void bikeEngineCapacity(){
    assertEquals(500, bike.capacityOfEngine());
  }

  @Test public void bikeGoodToDrive(){
    assertEquals("Yes!", bike.goodToDrive());
  }

}