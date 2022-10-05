package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {

    @ParameterizedTest
    @ValueSource(strings = { "소나타", "아이오닉" })
    void 이름_5자리_이하(String name) {
        assertEquals(new Name(name).getName(), name);
    }

    @ParameterizedTest
    @ValueSource(strings = { "롤스로이스 고스트", "람보르기니 우라칸" })
    void 이름_5자리_초과(String name) {
        RuntimeException exception = assertThrows(IllegalArgumentException.class,
                () -> { new Name(name); });

        assertEquals("자동차 이름은 5자 이하만 가능합니다.", exception.getMessage());
    }
}
