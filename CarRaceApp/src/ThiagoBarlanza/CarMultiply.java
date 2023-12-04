package ThiagoBarlanza;

public class CarMultiply extends RaceCar {

    private double power;
    public CarMultiply(double power, int maxSpeed, String name ) {
        super(maxSpeed, name);
        if (power > 1 && power < 2){
              this.power = power;

        }else {
            this.power = 1.5;
        }
    }

    @Override
    public void accelerate() {
        if (speed == 0) {
            speed = 10;
        }else {
            speed *= power;
            if (speed > maxSpeed)
                speed = maxSpeed;
        }
    }
}
