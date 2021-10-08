package racinggame.car;

import nextstep.utils.Randoms;

public class RacingCar {

    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    private Car car;
    private RacingResult racingResult;

    public RacingCar(Car car) {
        this.car = car;
        this.racingResult = new RacingResult();
    }

    public void play() {
        int random = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
        CarStatus status = car.play(random);
        racingResult.report(status);
    }

    public RacingResult getRacingResult() {
        return this.racingResult;
    }

    public Car getCar() {
        return this.car;
    }
}
