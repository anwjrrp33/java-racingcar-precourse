package racingcar.code;

public enum GameRoundErrorCode implements ErrorCode {

    NUMBER("시도 횟수는 숫자만 입력 가능합니다.");

    private final String message;

    GameRoundErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR + message;
    }
}
