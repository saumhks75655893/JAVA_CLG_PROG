// Access modifiers in java : ----------

// default access modifier
class Student
{
    String name; 
    int age; 
    int rollNo; 

    Student(String name, int age, int rollNo)
    {
        this.name = name; 
        this.age = age; 
        this.rollNo = rollNo;
    }

    public void PrintInfo()
    {
        System.out.println("Student name is : "+ name);
        System.out.println("Student age is : "+age);
        System.out.println("Student rollNo is : "+rollNo);
    }
}
// private access modifier
class Student1
{
    private String name; 
    private int age; 
    private int rollNo; 

    Student1(String name, int age, int rollNo)
    {
        this.name = name; 
        this.age = age; 
        this.rollNo = rollNo;
    }

    public void PrintInfo()
    {
        System.out.println();
        System.out.println("Student name is : "+ name);
        System.out.println("Student age is : "+age);
        System.out.println("Student rollNo is : "+rollNo);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Student s1 = new Student("Himanshu", 21, 15); 
        s1.PrintInfo();

        Student1 s2 = new Student1("Shalini", 23, 20); 
        s2.PrintInfo();
    }
}
