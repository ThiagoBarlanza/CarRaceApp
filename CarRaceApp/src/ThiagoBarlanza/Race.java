package ThiagoBarlanza;

import java.util.HashMap;
import java.util.Map;

public class Race {

    private int raceTrack;
    private Map<RaceCar, Integer> cars = new HashMap<>();

    public Race(int distance ){
        raceTrack = distance;
    }

    public void addCar(RaceCar car){
        cars.put(car, 0);
    }

    private boolean raceOver(){
        for (Integer val : cars.values()){
            if (val >= raceTrack)
                  return true;
        }
        return false;
    }

    public void startRace() {
        System.out.println("Start your engines.");
        System.out.println("Vrumm!! VRUMMMMM!!!!");

        try {
            // Sleep 3 sec
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("Ready...");

        try {
            // Sleep 3 sec
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("Set...");

        try {
            // Sleep 3 sec
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("GO!!");

        while (!raceOver()) {
            for (RaceCar car : cars.keySet()) {
                car.accelerate();
                int distance = cars.get(car);
                distance += car.getSpeed();
                cars.put(car, distance);
            }

        }
        // Find the fast car
        Map.Entry<RaceCar, Integer> maxEntry = null;
        for (Map.Entry<RaceCar, Integer> entry : cars.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }


        for (RaceCar car : cars.keySet()){
            System.out.println(car.getName() + " - " + cars.get(car) + " KM ");

        }

        // Check if any cars have been found
        if (maxEntry != null) {
            System.out.println("Winner: " + maxEntry.getKey().getName()+ "!!!");

        } else {
            System.out.println("No cars in the race.");
        }



    }

}
