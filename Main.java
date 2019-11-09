/**
 * Домашнее задание к 4 уроку Java 1
 * Оксана Марковская
 * 08.11.2019
 *
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
 * 2. Конструктор класса должен заполнять эти поля при создании объекта;
 * 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 * 4. Вывести при помощи методов из пункта 3 ФИО и должность
 * 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
 * 7. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный
 * уникальный идентификационный порядковый номер
 * */

package ru.geekbrains.lesson_4;



public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();

        /**
         * 4. Вывести при помощи методов из пункта 3 ФИО и должность
         * */
        System.out.println(worker.getName());
        System.out.println(worker.getProfession());


        /**
         * 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
         * */
        Worker[] arrWorker = new Worker[5];
        arrWorker[0] = new Worker("Иванов Станислав", "шефповар", "0214 525 64 18", 20000, 46);
        arrWorker[1] = new Worker("Петров Дмитрий", "повар", "0154 278 56 98", 15000, 50);
        arrWorker[2] = new Worker("Александров Евгений", "бармен", "0178 256 69 85", 14000, 35);
        arrWorker[3] = new Worker("Трофимова Елена", "официант", "0158 231 52 87", 12000, 25);
        arrWorker[4] = new Worker("Свиридов Сергей", "сторож", "0154 854 78 98", 8000, 60);

        for (int i = 0; i < arrWorker.length ; i++) {
            if(arrWorker[i].getAge() >= 40){
               System.out.println(arrWorker[i].getName());
           }
       }
        SALARY(arrWorker);

        Worker worker_1 = new Worker(0, 0, "Ivanov", 35);
        Worker worker_2 = new Worker(1, 0, "Petrov", 25);

        System.out.println("работник " + worker_1.getA() + " "+ worker_1.getName());


    }

    /**
     * 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
     **/
    private static void SALARY (Worker [] arr){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i].getAge() > 45){
                arr[i].setSalary(arr[i].getSalary() + 5000);
            }
            System.out.println(arr[i].getName() + " " + arr[i].getSalary());
        }

    }
}