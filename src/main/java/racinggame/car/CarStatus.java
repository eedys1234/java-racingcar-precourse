package racinggame.car;

public enum CarStatus {

    GO("-"), STOP("");

    private static final int CRITERIA = 4;
    private String value;

    CarStatus(final String value) {
        this.value = value;
    }

    public static boolean isGo(int number) {
        return number >= CRITERIA;
    }
}
