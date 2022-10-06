package racingcar.model;

public class Car {

    private static final int STOP_FORWARD_NUMBER = 3;

    private final Name name;

    private final Distance distance;

    public Car(final String name) {
        this.name = new Name(name);
        this.distance = new Distance();
    }

    public String getName() {
        return name.getName();
    }

    public int getDistance() {
        return distance.getDistance();
    }

    public void moveForward(final int number) {
        if (STOP_FORWARD_NUMBER < number) {
            distance.increase();
        }
    }
}
