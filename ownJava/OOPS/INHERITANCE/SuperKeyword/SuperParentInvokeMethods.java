package ownJava.OOPS.INHERITANCE.SuperKeyword;

class Animal1 {
    void eat() {
        System.out.println("Eatring....");
    }
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("Eating bread... ");
    }

    void bark() {
        System.out.println("Barking....");
    }

    void work() {
        super.eat();
        bark();
    }
}

public class SuperParentInvokeMethods {
    public static void main(String[] args){
        Dog1 d = new Dog1();
        d.work();
    }
}
