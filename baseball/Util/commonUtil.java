package baseball.Util;

public class commonUtil {
    public static int compareCharacter(char c1, char c2) {
        if (c1 == c2) {
            return 1;
        }

        return 0;
    }

    public static int isContainsStr(String line, String compare, int index) {
        int findCompareIndex = line.indexOf(compare);

        if (line.contains(compare) && findCompareIndex != index) {
            return 1;
        }

        return 0;
    }
}
