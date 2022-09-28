package baseball.View;

import baseball.Domain.Ball;

public class PrintMessage {
    private final String USER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final String NEW_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void printUserInputMessage() {
        System.out.println(USER_INPUT_MESSAGE);
    }

    public void printGameEndMessage() {
        System.out.println(GAME_END_MESSAGE);
    }

    public void printNewGameMessage() {
        System.out.println(NEW_GAME_MESSAGE);
    }

    public void printGameResult(Ball ball) {
        String gameResultLine = "";
        gameResultLine += ball.getBallCount() > 0 ? ball.getBallCount() + "볼 " : "";
        gameResultLine += ball.getStrikeCount() > 0 ? ball.getStrikeCount() + "스트라이크 " : "";

        if (ball.getBallCount() == 0 && ball.getStrikeCount() == 0) {
            gameResultLine += "낫씽";
        }

        System.out.println(gameResultLine);
    }

}
