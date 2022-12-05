package ru.job4j.mypack;

public class Dog {
    private String name;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog" +
                "\n name='" + name + '\'' +
                ",\n age=" + age +
                ",\n color='" + color + '\'' ;
    }


    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void sayDog(String name) {
        System.out.println(name + " say'd gav");
    }
    public void dataDog(String name, int age) {
        System.out.println(name + " " + age);
    }
    public Dog() {
    }
}
