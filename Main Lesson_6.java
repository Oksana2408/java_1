/**
 * Домашнее задание к 6 уроку Java 1
 * Оксана Марковская
 * 16.11.2019
 *
 * 1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
 *
 * 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла,
 * потом текст из второго.
 *
 * 3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово
 * (или словосочетание, или предложение) в файле. (Работаем только с латиницей)
 *
 * 4. ** Написать метод, проверяющий, есть ли указанное слово в файлах папки
 * **/

package ru.geekbrains.lesson_6;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            FileOutputStream f_1 = new FileOutputStream ("file_1.txt");
            String st = "Morgen, morgen, nur nicht heute";
            byte b [] = st.getBytes();
            f_1.write(b);
            f_1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream f_2 = new FileOutputStream ("file_2.txt");
            String st_1 = "sagen alle faule Leute.";
            byte c [] = st_1.getBytes();
            f_2.write(c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("file_1.txt");
            FileOutputStream fs = new FileOutputStream("file_3.txt");
            int i;
            while ((i = fin.read()) != -1)
                fs.write(i);
            fin.close();

            String st;
            st = "\n";
            byte b [] = st.getBytes();
            fs.write(b);

            FileInputStream fin_1 = new FileInputStream("file_2.txt");
            int j;
            while (( j = fin_1.read()) != -1)
                fs.write(j);
            fin_1.close();


       }catch (IOException e){
           e.printStackTrace();
       }
    }

    private static boolean SearchWord (String string){
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Введите искомое слово:");
        String WORD = SCANNER.nextLine();
        if (string.equals(WORD)){
            System.out.println("Слово " + WORD + " есть в данном файле");
        } else {
            System.out.println("Слово " + WORD + " остсутствует в данном файле");
        } return true;
    }
}