package racinggame.car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cars implements Iterable {

    private static final String SEPARATOR = ",";
    List<Car> cars;

    public Cars(String names) {
        this.cars = create(names);
    }

    private List<Car> create(String names) {
        List<Car> cars = new ArrayList<>();
        String[] splitNames = split(names);

        for(String name : splitNames) {
            cars.add(new Car(name));
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
}
