package org.jatin.strings;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("The Daily Byte"));
    }

    private static String reverse(String str) {
        int n = str.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return new String(stringBuilder);
    }
}
