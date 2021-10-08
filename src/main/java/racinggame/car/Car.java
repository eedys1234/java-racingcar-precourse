package racinggame.car;

import nextstep.utils.Randoms;

public class Car {

    private static final String INVALID_NAME = "1글자 이상 5글자 이하일경우만 이름을 입력할 수 있습니다.";
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    private String name;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if(name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(INVALID_NAME);
        }
    }

    public String name() {
        return this.name;
    }

    public int play() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}
