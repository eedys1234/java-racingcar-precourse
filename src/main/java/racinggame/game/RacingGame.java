package racinggame.game;

import racinggame.car.RacingCars;
import racinggame.referee.Referee;
import racinggame.referee.Winners;
import racinggame.result.PlayOnceResult;
import racinggame.ui.Input;
import racinggame.ui.Output;

public class RacingGame {

    private RacingCars racingCars;
    private RacingTime racingTime;
    private Referee referee;

    public RacingGame() {
        referee = new Referee();
    }

    public void run() {
        receiveRacingCarNamesFromUser();
        receiveRacingTimeFromUser();
        play();
    }

    private void receiveRacingCarNamesFromUser() {
        try {
            Output.printCarNamesInput();
            racingCars = new RacingCars(Input.readCarNames());
        }
        catch (IllegalArgumentException e) {
            Output.printErrorMessage(e.getMessage());
            receiveRacingCarNamesFromUser();
        }
    }

    private void receiveRacingTimeFromUser() {
        try {
            Output.printRacingTimeInput();
            racingTime = new RacingTime(Input.readRacingTime());
        } catch (IllegalArgumentException e) {
            Output.printErrorMessage(e.getMessage());
            receiveRacingTimeFromUser();
        }
    }

    private void play() {

        while(racingTime.hasNext()) {
            PlayOnceResult playOnceResult = racingCars.playOnce();
            Output.printPlayOnceResult(playOnceResult.display());
            racingTime.execute();
        }

        Winners winners = referee.judge(racingCars);
        Output.printRacingWinnerResult(winners.get());
    }

}
