package baseball;

import baseball.Controller.GamePlay;

public class BaseballApplication {
    public static void main(String[] args) {
        GamePlay gamePlay = new GamePlay();
        gamePlay.startGamePlay();
    }
}
