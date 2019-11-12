package ru.geekbrains.lesson_5;

public class Animal {
    String name;

    protected float height;
    protected int length;
    float maxHeight;
    int maxLength;
    int maxLengthSwim;
    Animal(String name, int maxLength, float maxHeight, int maxLengthSwim) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.maxLengthSwim = maxLengthSwim;

    }

    void run(int length){
        System.out.println(name + "побежал");
    }

    void jump(float height){
        System.out.println(name + "прыгнул");
    }

    void swim(int length){
        System.out.println(name + "поплыл");
    }

}
