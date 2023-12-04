package ThiagoBarlanza;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarSumTest {

    RaceCar c;
    @Before
    public void createCar(){
        c = new CarSum(10,100, "Test Car");
    }

    @Test
    public void testStoppedCar(){

        assertEquals(0, c.getSpeed());
    }

    @Test
    public void testAccelerate(){

        c.accelerate();
        assertEquals(10, c.getSpeed());
    }

    @Test
    public void testBrake(){
        c.accelerate();
        c.brake();
        assertEquals(5, c.getSpeed());
    }

    @Test
    public void testBrakeToZero(){
        c.accelerate();
        c.brake();
        c.brake();
        c.brake();
        c.brake();
        assertEquals(0, c.getSpeed());
    }

    @Test
    public void testMaxSpeedAccelerate(){
        for (int i = 0; i < 14 ; i++)
        c.accelerate();
        assertEquals(100, c.getSpeed());
    }

}
