package racingcar.model;

import racingcar.code.GameRoundErrorCode;

public class GameRound {

    private static final String REGEX = "[0-9]+";

    private final int gameRound;

    public GameRound(final String gameRound) {
        roundNumber(gameRound);
        this.gameRound = Integer.parseInt(gameRound);
    }

    private void roundNumber(final String round) {
        if (!round.matches(REGEX)) {
            throw new IllegalArgumentException(GameRoundErrorCode.NUMBER.getMessage());
        }
    }
}
