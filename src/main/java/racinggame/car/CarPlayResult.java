package racinggame.car;

import java.util.ArrayList;
import java.util.List;

public class CarPlayResult {

    private List<CarStatus> carStatuses;

    public CarPlayResult() {
        carStatuses = new ArrayList<>();
    }

    public String currentStatus() {
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
