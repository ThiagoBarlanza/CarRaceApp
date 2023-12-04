package ThiagoBarlanza;

public class Main {

    public static void main(String[] args) {
        Race javaRace = new Race(2000);

        javaRace.addCar(new CarSum(10,110, "Car *A* "));
        javaRace.addCar(new CarSum(8,140,"Car *B* "));
        javaRace.addCar(new CarMultiply(1.7,100, "Car *C* "));
        javaRace.addCar(new CarMultiply(1.4, 150, "Car *D* "));

        javaRace.startRace();

    }

}