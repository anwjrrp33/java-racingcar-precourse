package racingcar.model;

public class Name {

    private static final int MAX_LENGTH = 5;

    private final String name;

    public Name(final String name) {
        nameLength(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void nameLength(final String name) {
        if(name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
