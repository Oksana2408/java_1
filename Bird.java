package ru.geekbrains.lesson_5;

public class Bird extends Animal {
    protected Bird(String name, int maxLength, float maxHeight, int maxLengthSwim) {
        super(name, maxLength, maxHeight, maxLengthSwim);
    }

    @Override
    void run(int length) {
        if(length <= maxLength){
            System.out.println("Птичка " + name + " пробежал " + length + " метров!");
        }else{
            System.out.println( "Птичка " + name + " не смог пробежать " + length + " метров!");
        }
    }

    @Override
    void jump(float height) {
        if(height <= maxHeight){
            System.out.println("Птичка " + name + " прыгнул " + height + " метров!");
        }else{
            System.out.println("Птичка " + name + " не смог прыгнуть " + height + " метров!");
        }
    }

    @Override
    void swim(int length) {
        System.out.println("Птичка " + name + " не умеет плавать!");
    }
}
