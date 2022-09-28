package baseball.Service;

import baseball.Domain.Ball;
import baseball.View.PrintMessage;

public class PlayGameService {
    
    private Ball ball;
    private PrintMessage printMessage;

    public PlayGameService (Ball ball) {
        this.ball = ball;
        this.printMessage = new PrintMessage();
    }

    public void gameStart() {
        printMessage.printUserInputMessage();
    }

    public boolean checkGameEnding() {
        if (ball.getStrikeCount() == 3) {
            printMessage.printGameEndMessage();
            return true;
        }

        return false;
    }

    public void printGameResult() {
        printMessage.printGameResult(ball);
    }

    public void printGameRetryMessage() {
        printMessage.printNewGameMessage();
    }

    // getter setter
    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }
}
