package ru.job4j.inheritance;

public class Animal {
    public boolean stirka() {
        return true;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sayDog();
        cat.sayCat();
        cat.stirka();
    }
}
