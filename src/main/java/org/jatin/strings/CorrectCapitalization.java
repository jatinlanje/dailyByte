package org.jatin.strings;

public class CorrectCapitalization {
    public static void main(String[] args) {
        System.out.println(isCorrect("compUter"));
    }

    private static boolean isCorrect(String str) {
        int n = str.length();
        int capitalCount = 0;
        for (char ch : str.toCharArray()) {
            if (isUpperCase(ch)) {
                capitalCount++;
            }
        }
        if (capitalCount == 0 || capitalCount == n) {
            return true;
        }
        if (isUpperCase(str.charAt(0)) && capitalCount == 1) {
            return true;
        }
        return false;
    }

    private static boolean isUpperCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return true;
        }
        return false;
    }
}
