package racinggame.car;

import racinggame.ui.Output;

import java.util.NoSuchElementException;
import java.util.Objects;

import static racinggame.ui.Output.ERROR_MESSAGE;

public class Car {

    private static final String INVALID_NAME = "1글자 이상 5글자 이하일경우만 이름을 입력할 수 있습니다.";
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 5;

    private String name;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if(name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format("%s %s", Output.ERROR_MESSAGE, INVALID_NAME));
        }
    }

    public String name() {
        return this.name;
    }

    public CarStatus play(int random) {
        if(CarStatus.isMovingForward(random)) {
            return CarStatus.MOVING_FORWARD;
        }
        return CarStatus.STOP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
