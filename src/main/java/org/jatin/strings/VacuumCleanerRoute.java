package org.jatin.strings;

public class VacuumCleanerRoute {
    public static void main(String[] args) {
        System.out.println(isRobotReturn("RUULLDRD"));
    }

    private static boolean isRobotReturn(String str) {
        int x = 0, y = 0;
        for (char move : str.toCharArray()) {
            if (move == 'L') {
                x++;
            } else if (move == 'R') {
                x--;
            } else if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            }
        }
        return x == 0 && y == 0;
    }

}
