package ownJava.OOPS.INHERITANCE.INTERFACE_MULTIPLE_INHERITANCE;

class Student{
    int roll;
    void getroll(int n)
    {
        roll=n;
    }
    void putroll()
    {
        System.out.println("Roll : "+roll);
    }
}

class Test extends Student{
    float mark1, mark2;
    void getmarks(float m1, float m2){
        mark1=m1;
        mark2=m2;
    }

    void putmarks(){
        System.out.println("Mark1 : "+mark1+" mark2 : "+mark2);
    }
}
interface Sports{
    float sportmark = 6.0f;
    void putsports();
}

//multiple inheritance
class Result extends Test implements Sports{
    float total;
    public void putsports(){
        System.out.println("Sports marks : "+sportmark);
    }
    void display(){
        total = mark1 + mark2 + sportmark;
        putroll();
        putmarks();
        putsports();
        System.out.println("Total marks : "+total);
    }
}
//main class
public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        Result r = new Result();
        r.getroll(120);
        r.getmarks(104.48f, 35.9f);
        r.display();

    }
}
