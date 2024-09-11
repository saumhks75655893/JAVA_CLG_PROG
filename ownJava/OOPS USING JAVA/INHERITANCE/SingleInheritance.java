// Single Inheritance : ----------------------
 class Employee
 {
    int salary; 
    public void displaySalary()
    {
        System.out.println("Employee salary is : " + salary);
    }
 }

 class HR extends  Employee
 {
    int bonus; 
    public void displayBonus()
    {
        System.out.println("Bonus amount is : "+ bonus);
    }
 }
public class SingleInheritance {
    public static void main(String[] args) {
        HR e1 = new HR(); 
        e1.bonus = 2500; 
        e1.salary = 150000; 
        e1.displaySalary();
        System.out.println();
        e1.displayBonus();
    }
}
