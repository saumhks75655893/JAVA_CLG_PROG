package ownJava.OOPS.INHERITANCE.SuperKeyword;

class Animal2 {
    Animal2() {
        System.out.println("Animal2 Constructor");
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        super();
        System.out.println("Dog2 Constructor");
    }
}

public class SuperParentInvokeConstructor {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
    }
}
