package ownJava.OOPS.INCAPSULATION;

class Student {
    private String Name;
    private int Roll;
    private int Age;

    public void get_details() {
        System.out.println("Student Name: " + Name);
        System.out.println("Student Roll: " + Roll);
        System.out.println("Student Age: " + Age);
    }

    public void set_details(String Name, int Roll, int Age) {
        this.Name = Name;
        this.Roll = Roll;
        this.Age = Age;
    }
}

public class Incapsulation_basic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.set_details("Himanshu kumar", 101, 21);
        s1.get_details();
    }
}
