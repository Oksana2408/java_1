package ru.geekbrains.lesson_5;

public class Cat extends Animal {

    public Cat(String name, int maxLength, float maxHeight, int maxLengthSwim){
         super(name, maxLength, maxHeight, maxLengthSwim );
    }
    @Override
    void run(int length) {
        if(length <= maxLength){
            System.out.println("Кот " + name + " пробежал " + length + " метров!");
        } else {
            System.out.println("Кот " + name + " не смог пробежать " + length + " метров!");
        }
    }

    @Override
    void jump(float height) {
        if(height <= maxHeight){
            System.out.println("Кот " + name + " прыгнул " + height + " метров!");
        } else {
            System.out.println("Кот " + name + " не смог рыгнуть " + height + " метров!");
        }
    }

    @Override
    void swim(int length) {
        System.out.println("Кот " +name + " не умеет и не хочет плавать");
    }
}
