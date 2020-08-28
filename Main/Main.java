package Main;
class Dog {
    Integer height;
    String name;
    static String getType() {
        return "Dog";
    }
}

class Cat {
    Integer height;
    String name;
    static String getType() {
        return "Cat";
    }
}

class Main {
    public static void main (String[] args) {
        Dog woof = new Dog();
        Cat meow = new Cat();
        woof.height = 10;
        meow.height = 5;
        System.out.println(Cat.getType());
        System.out.println(Dog.getType());
    }
}