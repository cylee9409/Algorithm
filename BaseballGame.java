'''java 

import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        int gameNumLen = 3;
        Scanner input = null;

        String random = makeRandomNumber(gameNumLen);

        for (int chance = 0; chance < 5; chance++) {
            int strikeCount = 0;
            int ballCount = 0;
            int outCount = 0;

            input = new Scanner(System.in);
            String inputNumber = input.next();

            for (int i = 0; i < random.length(); i++) {
                if (random.charAt(i) == inputNumber.charAt(i)) {
                    strikeCount++;
                }
            }

            for (int i = 0; i < random.length(); i++) {
                for (int j = 0; j < random.length(); j++) {
                    if (i==j) {
                        continue;
                    }

                    if (random.charAt(i) == inputNumber.charAt(j)) {
                        ballCount++;
                    }
                }
            }

            for (int i = 0; i < inputNumber.length(); i++) {
                if (!random.contains(String.valueOf(inputNumber.charAt(i)))) {
                    outCount++;
                }
            }

            if (strikeCount == gameNumLen) {
                System.out.println("Correct. Game ends");
                input.close();
                return;
            }

            System.out.println(strikeCount + " Strike " + ballCount + " ball " + outCount + " out");
        }

        System.out.println("Failed");
        System.out.println("The answer is " + random);
        input.close();
    }

    private static String makeRandomNumber(int gameNumLen) {
        String random = "";
        System.out.println("Start");

        while (random.length() < gameNumLen) {
            int num = (int) (Math.random() * 10);
            if (random.contains(String.valueOf(num)) || num == 0) {
                continue;
            }

            random += num;
        }

        return random;
    }

}
