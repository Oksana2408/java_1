package ru.geekbrains.lesson_5;

public class Dog extends Animal {
    protected Dog(String name, int maxLength, float maxHeight, int maxLengthSwim ) {
        super(name, maxLength, maxHeight, maxLengthSwim);
    }

    @Override
    void run(int length) {
        if(length <= maxLength){
            System.out.println("Пес " + name + " пробежал " + length + " метров!");
        } else {
            System.out.println("Пес "+ name + " не смог пробежать " + length + " метров!");
        }
    }

    @Override
    void jump(float height) {
        if(height <= maxHeight){
            System.out.println("Пес " + name + " прыгнул " + height + " метров!");
        } else{
            System.out.println("Пес " + name + " не смог прыгнуть " + height + " метров!");
        }
    }

    @Override
    void swim(int length) {
        if(length <= maxLength){
            System.out.println("Пес " + name + " проплыл " + length + " метров!");
        }else{
            System.out.println("Пес " + name + " не смог проплыть " + length + " метров!");
        }
    }
}
