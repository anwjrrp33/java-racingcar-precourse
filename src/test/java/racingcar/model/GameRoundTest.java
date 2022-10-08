package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.code.GameRoundErrorCode;

public class GameRoundTest {

    @ParameterizedTest
    @ValueSource(strings = { "오", "구" })
    void 숫자가_아닌_문자(String round) {
        RuntimeException exception = assertThrows(IllegalArgumentException.class,
            () -> { new GameRound(round); });

        assertEquals(GameRoundErrorCode.NUMBER.getMessage(), exception.getMessage());
    }
}
