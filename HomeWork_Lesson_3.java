/**
 * Домашнее задание к 3 уроку Java 1
 * Оксана Марковская
 * 05.11.2019
 * **/


package ru.geekbrains.lesson_1;

import java.util.Random;
import java.util.Scanner;
public class HomeWork_Lesson_3 {

    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';

    private static void initField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }


        private static void showField () {
            for (int i = 0; i < fieldSizeX; i++) {
                System.out.print("|");
                for (int j = 0; j < fieldSizeY ; j++) {
                    System.out.print(field[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println("-------");
        }
        private static void humanTurn () {
            int x;
            int y;
            do {
                System.out.printf("Введите координаты X и Y (от 1  до %d) через %s>>> ", fieldSizeX, "пробел");
                x = SCANNER.nextInt() - 1;
                y = SCANNER.nextInt() - 1;
            } while (!isValidCell(x, y) || !isEmptyCell(x, y));
            field[y][x] = DOT_HUMAN;
        }

        private static boolean isValidCell ( int x, int y){
            return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
        }
        private static boolean isEmptyCell ( int x, int y){
            return field[y][x] == DOT_EMPTY;
        }
        private static void aiTurn () {
            int x;
            int y;
            do {
                x = RANDOM.nextInt(fieldSizeX);
                y = RANDOM.nextInt(fieldSizeY);
            } while (!isEmptyCell(x, y));
            field[y][x] = DOT_AI;
        }
        /**
         * * Переделать проверку победы, чтобы она не была реализована просто набором условий.
         * */


        private static boolean checkWin1 (char c) {
            int Winn = 1;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    checkDown(c);
                    checkRight(c);
                    checkDiagonal1(c);
                    checkDiagonal2(c);

                }
            } return false;
        }


       private static boolean checkDown (char c) {
            boolean Winn = true;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    Winn = Winn & (field[i][j = field.length - i -1] == c);
                }
            } return Winn;
        }

        private static boolean checkRight (char c){
            boolean Winn = true;
            for (int i = 0; i < field.length ; i++) {
                for (int j = 0; j < field.length; j++) {
                    Winn = Winn & (field[i = field.length - j -1][j] == c);
                }
            } return Winn;
        }

        private static boolean checkDiagonal1 (char c){
            boolean Winn = true;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    Winn = Winn & (field[i = j][j = i] == c);
                }
            } return Winn;
        }

        private static boolean checkDiagonal2 (char c){
            boolean Winn = true;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    Winn = Winn & (field[i = field.length - j -1][j = field.length - i -1] == c);
                }
            } return Winn;
        }

        private static boolean checkWin ( char c){
            if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
            if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
            if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;

            if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
            if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
            if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

            if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
            if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
            return false;
        }
        private static boolean isDraw () {
            for (int i = 0; i < fieldSizeY; i++) {
                for (int j = 0; j < fieldSizeX; j++) {
                    if (field[i][j] == DOT_EMPTY)
                        return false;
                }
            }
            return true;
        }

        public static void main (String[]args){
            initField();
            showField();
            while (true) {
                humanTurn();
                showField();
                if (checkWin1(DOT_HUMAN)) {
                    System.out.println("Human win!");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Draw!");
                    break;
                }
                aiTurn();
                showField();
                if (checkWin1(DOT_AI)) {
                    System.out.println("Computer win!");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Draw!");
                    break;
                }
            }

        }

        private static void method (String s, Object...b){
            b[0] = 1;
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }

}

    /**
     * Полностью разобраться с кодом;
     * Переделать проверку победы, чтобы она не была реализована просто набором условий.
     * * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества символов 4.
     * *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока, и пытаться выиграть сам.
     * */
