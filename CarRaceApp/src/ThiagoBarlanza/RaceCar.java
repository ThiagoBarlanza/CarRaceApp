package ThiagoBarlanza;

public abstract class RaceCar {
    protected int speed;
    protected int maxSpeed;
    protected String name;


    public RaceCar(int maxSpeed, String name) {
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public abstract void accelerate();

    public void brake(){
        speed /= 2;
    }

    public int getSpeed(){
        return speed;
    }

    public String getName() {
        return name;
    }
}
