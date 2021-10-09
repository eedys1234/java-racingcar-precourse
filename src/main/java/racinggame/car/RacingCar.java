package racinggame.car;

import nextstep.utils.Randoms;

import java.util.Objects;

public class RacingCar {

    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    private Car car;
    private CarPlayResult carPlayResult;

    public RacingCar(String name) {
        this.car = new Car(name);
        this.carPlayResult = new CarPlayResult();
    }

    public void play() {
        int random = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
        CarStatus status = car.play(random);
        carPlayResult.report(status);
    }

    public String currentStatus() {
        return this.carPlayResult.currentStatus();
    }

    public String carName() {
        return this.car.name();
    }

    public boolean equalCurrentStatus(RacingCar otherRacingCar) {
        return this.carPlayResult.currentStatus().equals(otherRacingCar.currentStatus());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCar car1 = (RacingCar) o;
        return Objects.equals(car, car1.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car);
    }
}
