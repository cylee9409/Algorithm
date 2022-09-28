package baseball.Controller;

import java.util.Scanner;

import baseball.Domain.Ball;
import baseball.Domain.UserInput;
import baseball.Service.PlayGameService;

public class GamePlay {
    private final int numberLength = 3;
    private final String GAME_CONTINUE_VALUE = "1";
    private final Scanner scan = new Scanner(System.in);

    private String getUserInput() {
        String userInputValue = scan.nextLine();
        return userInputValue;
    }

    public void startGamePlay() {
        
        String randomNumber = makeRandomNumber();

        do {

            PlayGameService playGameService = new PlayGameService(new Ball());

            repeatGame(randomNumber, playGameService);

        } while (getUserInput().equals(GAME_CONTINUE_VALUE));
    }

    private void repeatGame(String randomNumber, PlayGameService playGameService) {
        playGameService.gameStart();

        while (!playGameService.checkGameEnding()) {
            
            UserInput userInput = new UserInput(getUserInput());
            Ball ball = new Ball();

            ball.setStrikeCount(userInput.checkStrickCount(randomNumber));
            ball.setBallCount(userInput.checkBallCount(randomNumber));

            playGameService.setBall(ball);

            playGameService.printGameResult();
        }

        playGameService.printGameRetryMessage();
    }

    //이거 공통모듈로 다시 짜기
    private String makeRandomNumber() {
        String random = "";

        while(random.length() < numberLength) {
            int num = (int) (Math.random() * 10);
            if (random.contains(String.valueOf(num)) || num == 0) {
                continue;
            }

            random += num;
        }

        return random;
    }
}
