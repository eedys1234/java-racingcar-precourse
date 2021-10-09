package racinggame.referee;

import racinggame.car.RacingCar;
import racinggame.car.RacingCars;

import java.util.PriorityQueue;

public class Referee {

    public Winners judge(RacingCars racingCars) {

        Winners winners = new Winners();
        PriorityQueue<RacingCar> sortingRacingCars = sortingRacingCar(racingCars);
        RacingCar movingForwardCar = sortingRacingCars.poll();
        winners.addRacingCarName(movingForwardCar.carName());

        while(!sortingRacingCars.isEmpty()) {
            winners.addRacingCarName(matchCurrentStatus(movingForwardCar, sortingRacingCars.poll()));
        }

        return winners;
    }

    private String matchCurrentStatus(RacingCar movingForwardCar, RacingCar otherCar) {
        if(movingForwardCar.equalCurrentStatus(otherCar)) {
            return otherCar.carName();
        }

        return "";
    }

    private PriorityQueue<RacingCar> sortingRacingCar(RacingCars racingCars) {
        PriorityQueue<RacingCar> heap = new PriorityQueue<>((a, b) -> b.currentStatus().length() - a.currentStatus().length());

        for(RacingCar racingCar : racingCars) {
            heap.add(racingCar);
        }
        return heap;
    }

}
