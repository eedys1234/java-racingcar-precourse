package racinggame.car;

import racinggame.result.Result;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RacingCars implements Iterable {

    private static final String SEPARATOR = ",";
    List<RacingCar> cars;

    public RacingCars(String names) {
        this.cars = create(names);
    }

    private List<RacingCar> create(String names) {
        List<RacingCar> cars = new ArrayList<>();
        String[] splitNames = split(names);

        for(String name : splitNames) {
            cars.add(new RacingCar(name));
        }
        return cars;
    }

    private String[] split(String names) {
        return names.split(SEPARATOR);
    }

    @Override
    public Iterator iterator() {
        return cars.iterator();
    }

    public Result play() {
        Result result = new Result();
        for(RacingCar car : cars) {
            car.play();
            result.add(car);
        }
        return result;
    }
}
