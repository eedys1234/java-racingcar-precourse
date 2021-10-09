package racinggame.referee;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private List<String> carNames;

    public Winners() {
        this.carNames = new ArrayList<>();
    }

    public void addRacingCarName(String racingCarName) {
        if(racingCarName.length() > 0) {
            this.carNames.add(racingCarName);
        }
    }

    public String get() {
        return String.join(",", carNames);
    }

}
