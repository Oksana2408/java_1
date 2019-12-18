package ru.geekbrains.lesson_5;

public class Horse extends Animal {
    protected Horse(String name, int maxLength, float maxHeight, int maxLengthSwim) {
        super(name, maxLength, maxHeight, maxLengthSwim);
    }

    @Override
    void run(int length) {
        if(length <= maxLength){
            System.out.println("Конь " + name + " пробежал " + length + " метров!");
        }else{
            System.out.println("Конь " + name + " не смог пробежать " + length + " метров!");
        }
    }

    @Override
    void jump(float height) {
        if(height <= maxHeight){
            System.out.println("Конь " + name + " прыгнул " + height + " метров!");
        }else{
            System.out.println("Конь " + name + " не смог прыгнуть " + height + " метров!");
        }
    }

    @Override
    void swim(int length) {
        if(length <= maxLength){
            System.out.println("Конь " + name + " проплыл " + length + " метров!");
        }else{
            System.out.println("Конь " + name + " не смог проплыть " + length + " метров!");
        }
    }
}
