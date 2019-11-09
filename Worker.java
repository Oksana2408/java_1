package ru.geekbrains.lesson_4;

public class Worker {
    /**
     * 1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
     **/
    private String name;
    private String profession;
    private String phone;
    private int salary;
    private int age;
    private static final int pin = 1;
    private int a;


    /**
     * 2. Конструктор класса должен заполнять эти поля при создании объекта;
     */


    Worker(String name, String profession, String phone, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /**
     * 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
     */
    String getName() {
        return name;
    }

    String getProfession() {
        return profession;
    }

    String getPhone() {
        return phone;
    }

    int getSalary() {
        return salary;
    }

    int getAge() {
        return age;
    }


    void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * . *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный
     * уникальный идентификационный порядковый номер
     */
    Worker() {
    }

    Worker(int pin, int a,  String name, int age) {
        pin = ++pin;
        this.a = pin;
        this.name = name;
        this.age = age;

    }

    int getA() {
        return a;
    }
}








