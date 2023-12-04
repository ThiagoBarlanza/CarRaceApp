package ThiagoBarlanza;

public class CarSum extends RaceCar {
   private int power;

    public CarSum(int power, int maxSpeed, String name) {
        super(maxSpeed, name);
        this.power = power;
    }

    @Override
    public void accelerate(){
        speed += power;
        if (getSpeed() > maxSpeed)
             speed = maxSpeed;
    }

}
