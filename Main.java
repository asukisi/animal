class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " издает звук.");
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " лает.");
    }

    public void displayBreed() {
        System.out.println("Порода: " + breed);
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void lappingUpMilk() {
        System.out.println(name + " лакает молочко.");
    }

    public void displayColor() {
        System.out.println("Окрас: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар", 5, "Овчарка");
        Cat cat = new Cat("Барсик", 3, "Черный");

        dog.displayInfo();
        dog.makeSound();
        dog.displayBreed();
        System.out.println();

        cat.displayInfo();
        cat.lappingUpMilk();
        cat.displayColor();
    }
}
