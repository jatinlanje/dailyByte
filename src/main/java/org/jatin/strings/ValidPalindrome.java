package org.jatin.strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
    }

    private static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(ch);
            }
        }
        stringBuilder = new StringBuilder(stringBuilder.toString().toLowerCase());
        int start = 0;
        int end = stringBuilder.length() - 1;
        while (start < end) {
            if (stringBuilder.charAt(start) != stringBuilder.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
