package overriding_polymorphism;

class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Name: " + name);
        System.out.println("Taste: " + taste);
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Name: " + name);
        System.out.println("Taste: " + taste + " (Sweet)");
    }
}

class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Name: " + name);
        System.out.println("Taste: " + taste + " (Citrus)");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Generic Fruit", "Generic Taste", "Medium");
        fruit.eat();

        Apple apple = new Apple("Apple", "Crisp", "Medium");
        apple.eat();

        Orange orange = new Orange("Orange", "Juicy", "Medium");
        orange.eat();
    }
}
