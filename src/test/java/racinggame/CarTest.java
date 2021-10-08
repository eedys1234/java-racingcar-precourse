package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.car.Car;
import racinggame.result.RacingResult;
import racinggame.car.CarStatus;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setup() {
        String alien = "alien";
        car = new Car(alien);
    }

    @Test
    public void CarNaming() {
        String alien = "alien";
        assertThat(car.name()).isEqualTo(alien);
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

    @DisplayName("자동자가 전진 및 멈춤을 판별하는 기능 - GO 테스트")
    @Test
    public void CarPlay_GO() {

        RacingResult result = car.play(4);
        assertThat(result.gets()).contains(CarStatus.GO);
    }

    @DisplayName("자동자가 전진 및 멈춤을 판별하는 기능 - STOP 테스트")
    @Test
    public void CarPlay_STOP() {

        RacingResult result = car.play(3);
        assertThat(result.gets()).contains(CarStatus.STOP);
    }

}
