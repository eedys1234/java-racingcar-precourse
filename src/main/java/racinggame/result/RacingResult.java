package racinggame.result;

import racinggame.car.CarStatus;

import java.util.ArrayList;
import java.util.List;

public class RacingResult {

    private List<CarStatus> results;

    public RacingResult() {
        results = new ArrayList<>();
    }

    public List<CarStatus> gets() {
        return this.results;
    }

    public void report(CarStatus status) {
        results.add(status);
    }
}
