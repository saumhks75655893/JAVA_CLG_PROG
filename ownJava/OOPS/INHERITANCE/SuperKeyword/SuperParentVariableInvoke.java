package ownJava.OOPS.INHERITANCE.SuperKeyword;
class Animal{
    public String color = "White";
}

class Dog extends Animal{
    public String color = "Black";
    public void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class SuperParentVariableInvoke {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();

    }
}
