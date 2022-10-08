package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.dto.GameHistories;
import racingcar.dto.GameHistory;
import racingcar.util.Random;

public class Cars {

    private final List<Car> cars;

    public Cars(final String carNames) {
        this.cars = createCars(carNames.split(","));
    }

    private List<Car> createCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNames) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public GameHistories getHistories() {
        List<GameHistory> gameHistories = new ArrayList<>();

        for (Car car : cars) {
            car.moveForward(Random.location());
            gameHistories.add(new GameHistory(car.getName(), car.getDistance()));
        }

        return new GameHistories(gameHistories);
    }
}
