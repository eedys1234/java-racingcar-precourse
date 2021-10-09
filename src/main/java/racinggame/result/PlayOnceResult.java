package racinggame.result;

import racinggame.car.RacingCar;

public class PlayOnceResult {

    private StringBuilder displayString;

    public PlayOnceResult() {
        displayString = new StringBuilder();
    }

    public String display() {
        return displayString.toString();
    }

    public void report(RacingCar racingCar) {
        displayString.append(String.format("%s : %s", racingCar.carName(), racingCar.currentStatus()));
        displayString.append("\n");
    }

}
