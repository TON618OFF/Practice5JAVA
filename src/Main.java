interface Animal {
    void eat();
    void sound();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Собака ест корм");
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }
}

interface Pet extends Animal {
    void play();
}

class PetDog extends Dog implements Pet {
    @Override
    public void play() {
        System.out.println("Собака играет с мячом");
    }
}

class PetCat extends Cat implements Pet {
    @Override
    public void play() {
        System.out.println("Кошка играет с веревкой");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println("Собака:");
        dog.eat();
        dog.sound();

        System.out.println();

        Cat cat = new Cat();
        System.out.println("Кошка:");
        cat.eat();
        cat.sound();

        System.out.println();

        PetDog petDog = new PetDog();
        System.out.println("Домашняя собака:");
        petDog.eat();
        petDog.sound();
        petDog.play();

        System.out.println();

        PetCat petCat = new PetCat();
        System.out.println("Домашний кот:");
        petCat.eat();
        petCat.sound();
        petCat.play();
    }
}
