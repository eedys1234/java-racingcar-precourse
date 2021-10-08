package racinggame.ui;

public class Output {

    public static String ERROR_MESSAGE = "[ERROR]";

    private static String CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static String RACING_TIME_INPUT_MESSAGE = "시도할 회수는 몇회인가요?";

    public static void printCarNamesInput() {
        System.out.println(CAR_NAMES_INPUT_MESSAGE);
    }

    public static void printRacingTimeInput() {
        System.out.println(RACING_TIME_INPUT_MESSAGE);
    }

    public static void printResult(String result) {
        System.out.println(result);
    }
}
