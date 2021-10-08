package racinggame.ui;

public class Output {

    public static String ERROR_MESSAGE = "[ERROR]";

    private static String CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public static void printCarNamesInput() {
        System.out.println(CAR_NAMES_INPUT_MESSAGE);
    }
}
