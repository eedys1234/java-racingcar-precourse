package racinggame.car;

public class Car {

    private static final String INVALID_NAME = "1글자 이상 5글자 이하일경우만 이름을 입력할 수 있습니다.";

    private String name;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if(name.length() < 1 || name.length() > 5) {
            throw new IllegalArgumentException(INVALID_NAME);
        }
    }

    public String name() {
        return this.name;
    }
}
