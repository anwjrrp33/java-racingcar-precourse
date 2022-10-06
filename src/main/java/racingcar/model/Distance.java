package racingcar.model;

public class Distance {

    private static final int MIN_NUMBER = 0;

    private int distance;

    public Distance() {
        this.distance = MIN_NUMBER;
    }

    public int getDistance() {
        return this.distance;
    }

    public void increase() {
        this.distance++;
    }
}
