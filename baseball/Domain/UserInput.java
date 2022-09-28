package baseball.Domain;

import baseball.Util.commonUtil;

public class UserInput {
    
    private final int numberLength = 3;
    private String inputNumber;

    public UserInput(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int checkStrickCount(String randomNumber) {
        int result = 0;

        for (int i = 0; i < numberLength; i++) {
            result += commonUtil.compareCharacter(randomNumber.charAt(i), inputNumber.charAt(i));
        }

        return result;
    }

    public int checkBallCount(String randomNumber) {
        int result = 0;

        for (int i = 0; i < numberLength; i++) {
            result += commonUtil.isContainsStr(randomNumber, inputNumber.substring(i, i+1), i);
        }

        return result;
    }
}
