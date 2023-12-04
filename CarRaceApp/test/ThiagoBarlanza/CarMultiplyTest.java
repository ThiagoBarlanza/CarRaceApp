package ThiagoBarlanza;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarMultiplyTest {

    RaceCar c;
    @Before
    public void createCar(){
        c = new CarMultiply(1.5,100, "Test Car");
    }

    @Test
    public void testStoppedCar(){

        assertEquals(0, c.getSpeed());
    }

    @Test
    public void testAccelerateOnce(){

        c.accelerate();
        assertEquals(10, c.getSpeed());
    }

    @Test
    public void testAccelerateTwice(){

        c.accelerate();
        c.accelerate();
        assertEquals(15, c.getSpeed());
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
