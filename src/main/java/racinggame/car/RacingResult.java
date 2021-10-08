package racinggame.car;

import java.util.ArrayList;
import java.util.List;

public class RacingResult {

    private List<CarStatus> carStatuses;

    public RacingResult() {
        carStatuses = new ArrayList<>();
    }

    public String print() {
        StringBuilder marks = new StringBuilder();
        for(CarStatus status : carStatuses) {
            marks.append(status.mark());
        }

        return marks.toString();
    }

    public void report(CarStatus status) {
        carStatuses.add(status);
    }
}
