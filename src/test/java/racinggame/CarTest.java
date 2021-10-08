package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.car.Car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    public void CarNaming() {
        String pobi = "pobi";
        Car car = new Car(pobi);
        assertThat(car.name()).isEqualTo(pobi);
    }

    @DisplayName("자동차 이름이 1글자 이상 5글지 이하가 아닐경우 테스트")
    @Test
    public void CarNaming_5Length_LE() {

        String batman = "batman";
        String empty = "";

        String message = "1글자 이상 5글자 이하일경우만 이름을 입력할 수 있습니다.";
        assertThatThrownBy(() -> new Car(empty)).isInstanceOf(IllegalArgumentException.class).hasMessage(message);
        assertThatThrownBy(() -> new Car(batman)).isInstanceOf(IllegalArgumentException.class).hasMessage(message);
    }

    @DisplayName("자동차가 랜덤숫자를 생성하는 기능")
    @Test
    public void CarPlay() {

        String alien = "aline";
        Car car = new Car(alien);
        int result = car.play();
        assertThat(result).isGreaterThanOrEqualTo(1);
        assertThat(result).isLessThanOrEqualTo(9);
    }
}
