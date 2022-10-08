package racingcar.view;

import java.util.List;
import racingcar.dto.GameHistories;
import racingcar.dto.GameHistory;

public class outputView {

    private static final String RESULT = "실행 결과";

    private static final String LINE = "\n";

    private static final String COLON = " : ";

    public static void outputGamePlayHistories(List<GameHistories> gamePlayHistories) {
        System.out.println(RESULT);
        for (GameHistories gameHistories : gamePlayHistories) {
            outputGameHistory(gameHistories);
        }
    }

    private static void outputGameHistory(GameHistories gameHistories) {
        StringBuilder st = new StringBuilder();

        for (GameHistory gameHistory : gameHistories.getPlayHistories()) {
            st.append(gameHistory.getName() + COLON + gameHistory.getDistance());
            st.append(LINE);
        }

        System.out.println(st);
    }
}
