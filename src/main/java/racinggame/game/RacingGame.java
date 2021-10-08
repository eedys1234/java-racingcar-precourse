package racinggame.game;

import racinggame.car.RacingCars;
import racinggame.result.Result;
import racinggame.ui.Input;
import racinggame.ui.Output;

public class RacingGame {

    private RacingCars cars;

    public void run() {
        Output.printCarNamesInput();
        cars = new RacingCars(Input.readCarNames());

        Output.printRacingTimeInput();
        RacingTime racingTime = new RacingTime(Input.readRacingTime());
        play(racingTime);
    }

    private void play(RacingTime racingTime) {

        while(racingTime.hasNext()) {
            Result result = cars.play();
            Output.printResult(result.display());
            racingTime.execute();
        }

    }
}
