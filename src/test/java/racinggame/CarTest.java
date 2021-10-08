package racinggame;

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

    @Test
    public void CarNaming_5Length_LE() {

        String batman = "batman";
        String empty = "";

        String message = "1글자 이상 5글자 이하일경우만 이름을 입력할 수 있습니다.";
        assertThatThrownBy(() -> new Car(empty)).isInstanceOf(IllegalArgumentException.class).hasMessage(message);
        assertThatThrownBy(() -> new Car(batman)).isInstanceOf(IllegalArgumentException.class).hasMessage(message);
    }
}
