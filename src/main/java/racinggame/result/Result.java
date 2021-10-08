package racinggame.result;

import racinggame.car.Car;
import racinggame.car.RacingCar;
import racinggame.car.RacingResult;

public class Result {

    private StringBuilder displayString;

    public Result() {
        displayString = new StringBuilder();
    }

    public String display() {
        return displayString.toString();
    }

    public void add(RacingCar racingCar) {
        RacingResult racingResult = racingCar.getRacingResult();
        Car car = racingCar.getCar();
        displayString.append(String.format("%s:%s", car.name(), racingResult.print()));
        displayString.append("\n");
    }
}
