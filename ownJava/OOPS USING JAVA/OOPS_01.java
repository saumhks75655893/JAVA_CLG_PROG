class Student {
    String name;
    int rollNo;
    int marks;

    // Default constructor
    Student() {
        System.out.println();
        System.out.println("This is default constructor !!!! ");
        System.out.println();
    }

    // Parameterized constructor
    Student(String name, int rollNO, int marks) {
        this.name = name;
        this.rollNo = rollNO;
        this.marks = marks;
    }

    // copy constructor
    Student(Student s) {
        name = s.name;
        rollNo = s.rollNo;
        marks = s.marks;
    }

    public void studentDetails() {
        System.out.println();
        System.out.println("Student name is : " + this.name);
        System.out.println("Student rollNO is : " + this.rollNo);
        System.out.println("Student marks is : " + this.marks);
    }

}

// final keyword
class A {
    final int a = 10; // intiliation is mendatory

    public void printValue() {
        System.out.println("value of a is : " + a);
    }

    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed !!! ");
    }

}

public class OOPS_01 {
    public static void main(String[] args) {
        Student s1 = new Student("Radha", 45, 345); // constructor
        s1.studentDetails();

        Student s2 = new Student("Sundaram  kumar", 20, 159);
        s2.studentDetails();

        Student s3 = new Student(s2);
        s3.studentDetails();

        Student one = new Student();
        Student two = one;

        one.name = "something something";
        two.rollNo = 10;

        two.studentDetails();
        one.studentDetails();

        A obj;
        for (int i = 0; i < 100000; i++) {
            obj = new A("Random name");
        }
    }
}
