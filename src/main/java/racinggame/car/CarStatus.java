package racinggame.car;

public enum CarStatus {

    MOVING_FORWARD("-"), STOP("");

    private static final int CRITERIA = 4;
    private String mark;

    CarStatus(final String mark) {
        this.mark = mark;
    }

    public static boolean isMovingForward(int number) {
        return number >= CRITERIA;
    }

    public String mark() {
        return this.mark;
    }
}
