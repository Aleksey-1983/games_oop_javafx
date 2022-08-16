package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoHorizontalWin(board, i) || monoVerticalWin(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoHorizontalWin(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVerticalWin(int[][] board, int cell) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}