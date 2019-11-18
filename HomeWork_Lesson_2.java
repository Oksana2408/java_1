/**
 * Домашнее задание ко 2 уроку Java 1
 * Оксана Марковская
 * 01.11.2019
 * **/

package ru.geekbrains.lesson_1;

import java.util.Arrays;

public class HomeWork_Lesson_2 {
    public static void main(String[] args) {

        int[] brr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        replacement(brr);
        System.out.println(" ");

        int[] frr = new int[8];
        fill(frr);
        System.out.println(" ");

        int[] mrr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        mult(mrr);
        System.out.println(" ");

        max(mrr);
        System.out.println(" ");

        int[][] drr = new int[5][5];
        diagonal(drr);
        System.out.println(" ");

        int[] krr = {10, 1, 2, 3, 4};
        System.out.println(checkBalance(krr));
        System.out.println(" ");

        displacement(krr,2);
        System.out.println(" ");
    }


    /**
     * 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */

    private static void replacement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его
     * значениями 1 4 7 10 13 16 19 22;
     */

    private static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3 + 1;
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий
     * на вход массив и умножающий числа меньше 6 на 2;
     **/
    private static void mult(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i] * 2 : arr[i];
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
     */

    public static void max(int[] arr) {

        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++)
            if (maximum < arr[i]) maximum = arr[i];
        System.out.println("Максимум в массиве - " + maximum);
        System.out.println("Минимум в массиве - "+ minimum);
    }

    /**
     * 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
     * заполнить его диагональные элементы единицами, используя цикл(ы);
     **/
    /**
     * Не оптимальное решение, но лучше чем никакого.
     */
    private static void diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j){
                    arr[i][j] = 1;
                } else if (j == arr.length - i -1){
                    arr[i][j] = 1;
                } else{
                    arr[i][j] = 0;
                }
            }
        }
        for (int[] aArr : arr) {
            System.out.println(Arrays.toString(aArr));
        }
    }

    /**
     * 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true
     * если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
     * checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
     * checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
     */
    private static boolean checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(sum % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным,
     * или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
     *
     * Комментари: написала код, но он не работает так как надо. Но пока на это хватило знаний.
     */
    private static void displacement(int[] arr, int n) {
        if (n >= 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[0] = arr[i+=n];
                System.out.println(arr[i] + " ");
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[0] = arr[i-=n];
                System.out.println(arr[i] + " ");
            }
        }
    }
}