package racinggame.game;

import racinggame.ui.Output;

public class RacingTime {

    private static final String INVALID_LENGTH_TIME_MESSAGE = "유효하지 않은 길이입니다.";
    private static final String INVALID_FORMAT_TIME_MESSAGE = "유효하지 않은 형식입니다.";

    private int time;

    public RacingTime(String time) {
        validate(time);
        this.time = Integer.parseInt(time);
    }

    public void execute() {
        this.time--;
    }

    public boolean hasNext() {
        return 0 < this.time;
    }

    public void validate(String time) {
        if(time.length() > 1) {
            throw new IllegalArgumentException(String.format("%s %s", Output.ERROR_MESSAGE, INVALID_LENGTH_TIME_MESSAGE));
        }

        try {
            Integer.parseInt(time);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("%s %s", Output.ERROR_MESSAGE, INVALID_FORMAT_TIME_MESSAGE));
        }
    }
}
